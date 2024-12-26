package jgit.push.api.service.impl;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import jgit.push.domain.dto.GitInfoDto;
import jgit.push.domain.dto.PushList;
import jgit.push.domain.entity.GitInfo;
import jgit.push.domain.repository.GitInfoRepository;
import lombok.RequiredArgsConstructor;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.errors.RepositoryNotFoundException;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
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
    public Map<String, String> checkGitRepository(GitPushRequest request) {
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
            Git.lsRemoteRepository()
                    .setHeads(true)
                    .setTags(true)
                    .setRemote(url)
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, token))
                    .call();
            result.put("status", "success");
            result.put("message", "Git 인증 성공");
        } catch (InvalidRemoteException e) {
            result.put("status", "error");
            result.put("message", "유효하지 않은 Git URL입니다.");
        } catch (TransportException e) {
            if (e.getMessage().contains("Authentication is required") || e.getMessage().contains("not authorized")) {
                result.put("status", "error");
                result.put("message", "유효하지 않은 사용자 이름 또는 토큰입니다.");
            } else if (e.getMessage().contains("Not Found")) {
                result.put("status", "error");
                result.put("message", "입력한 Git URL이 존재하지 않습니다.");
            } else if (e.getMessage().contains("Invalid username or token")) {
                result.put("status", "error");
                result.put("message", "유효하지 않은 사용자 이름 또는 토큰입니다.");
            } else {
                result.put("status", "error");
                result.put("message", "전송 오류 : " + e.getMessage());
            }
        } catch (GitAPIException e) {
            result.put("status", "error");
            result.put("message", "Git 인증 오류 발생");
        }
    }
}
