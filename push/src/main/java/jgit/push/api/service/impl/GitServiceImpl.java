package jgit.push.api.service.impl;

import jgit.push.api.controller.request.GitCheckRequest;
import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import jgit.push.domain.dto.GitInfoDto;
import jgit.push.domain.dto.PushList;
import jgit.push.domain.entity.GitInfo;
import jgit.push.domain.repository.GitInfoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.errors.RepositoryNotFoundException;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GitServiceImpl implements GitService {

    private final GitInfoRepository gitInfoRepository;

    @Override
    public void pushGithub(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException {
        try {
            pushDir(request);
        } catch (RepositoryNotFoundException e) {
            initRepoWithPush(request);
        }
    }

    @Transactional
    @Override
    public void saveGitPushInfo(GitPushRequest request) {
        String token = request.getToken();
        gitInfoRepository.save(new GitInfo(
                request.getLocalpath(),
                request.getUrl(),
                request.getUsername(),
                token,
                request.getMessage()
        ));
    }

    @Override
    public List<PushList> findPushList() {
        List<GitInfo> gitInfoList = gitInfoRepository.findAll();
        return savePushlist(gitInfoList);
    }

    @Override
    public List<PushList> findPushListByName(String username) {
        List<GitInfo> gitInfoList = gitInfoRepository.findAllByUsername(username);
        return savePushlist(gitInfoList);
    }

    @Override
    public GitInfoDto findByNameAndUrl(String username, String url) {
        GitInfo gitInfo = gitInfoRepository.findByUsernameAndUrl(username, url);
        return makeGitInfoDto(gitInfo);
    }

    @Override
    @Transactional
    public void deletePushList(Long id) {
        gitInfoRepository.deleteById(id);
    }

    private void initRepoWithPush(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException {
        Git.init().setDirectory(new File(request.getLocalpath())).call();
        Git git = Git.open(new File(request.getLocalpath()));
        git.remoteAdd().setName("origin").setUri(new URIish(request.getUrl())).call();
        git.add().addFilepattern(".").call();
        git.commit().setMessage(request.getMessage()).call();
        PushCommand pushCommand = git.push();
        pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(request.getUsername(), request.getToken()));
        pushCommand.setForce(true);
        pushCommand.call();

        git.close();
    }

    private void pushDir(GitPushRequest request) throws IOException, URISyntaxException, GitAPIException {
        Git git = Git.open(new File(request.getLocalpath()));
        git.remoteAdd().setName("origin").setUri(new URIish(request.getUrl())).call();
        git.add().addFilepattern(".").call();
        git.commit().setMessage(request.getMessage()).call();
        PushCommand pushCommand = git.push();
        pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(request.getUsername(), request.getToken()));
        pushCommand.setForce(true);
        pushCommand.call();

        git.close();
    }

    @Override
    public Map<String, String> checkGitRepository(GitCheckRequest request) {
        String url = request.getUrl();
        String username = request.getUsername();
        String token = request.getToken();
        Map<String, String> result = new HashMap<>();

        handleError(url, username, token, result);
        return result;
    }

    private List<PushList> savePushlist(List<GitInfo> gitInfoList) {
        return gitInfoList.stream()
                .map(gitInfo -> PushList.builder()
                        .id(gitInfo.getId())
                        .localPath(gitInfo.getLocalPath())
                        .url(gitInfo.getUrl())
                        .username(gitInfo.getUsername())
                        .encryptedToken(gitInfo.getEncryptedToken())
                        .rawToken(gitInfo.getRawToken())
                        .message(gitInfo.getMessage())
                        .createdDateTime(gitInfo.getCreatedDateTime())
                        .build())
                .collect(Collectors.toList());
    }

    private GitInfoDto makeGitInfoDto(GitInfo gitInfo) {
        return GitInfoDto.builder()
                .localPath(gitInfo.getLocalPath())
                .url(gitInfo.getUrl())
                .username(gitInfo.getUsername())
                .rawToken(gitInfo.getRawToken())
                .message(gitInfo.getMessage())
                .build();
    }

    private void handleError(String url, String username, String token, Map<String, String> result) {
        try {
            boolean isPrivate = isPrivateRepository(url, username, token);
            if (isPrivate) {
                result.put("status", "success");
                result.put("message", "Git 인증 성공: Private Repository");
            } else {
                result.put("status", "success");
                result.put("message", "Git 인증 성공: Public Repository");
            }
        } catch (Exception e) {
            if (e.getMessage().contains("Unauthorized")) {
                result.put("status", "error");
                result.put("message", "유효하지 않은 유저명 또는 Token입니다.");
            } else if(e.getMessage().contains("Not Found")){
                result.put("status", "error");
                result.put("message", "유저명 또는 URL을 찾을 수 없습니다.");
            } else {
                result.put("status", "error");
                result.put("message", "Git 인증 실패: " + e.getMessage());
            }
        }
    }

    private boolean isPrivateRepository(String url, String username, String token) throws Exception{
        String apiUrl = "https://api.github.com/repos/" + username + "/" + getRepositoryName(url);
        Response response = Request.Get(apiUrl)
                .addHeader("Authorization", "token " + token)
                .execute();
        String responseBody = response.returnContent().asString();
        JSONObject jsonObject = new JSONObject(responseBody);
        return jsonObject.getBoolean("private");
    }

    private String getRepositoryName(String url) {
        return url.substring(url.lastIndexOf("/") + 1);
    }
}
