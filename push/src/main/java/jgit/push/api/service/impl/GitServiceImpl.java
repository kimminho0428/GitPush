package jgit.push.api.service.impl;

import ch.qos.logback.core.util.StringUtil;
import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

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
    public List<GitInfo> findPushList() {
        return gitInfoRepository.findAll();
    }

    @Override
    public List<GitInfo> findPushListByName(String username) {
        return gitInfoRepository.findAllByUsername(username);
    }

    @Override
    public GitInfo findByNameAndUrl(String username, String url) {
        return gitInfoRepository.findByUsernameAndUrl(username, url);
    }

    private void initRepoWithPush(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException {
        // 새 저장소 초기화
        Git.init().setDirectory(new File(request.getLocalpath())).call();

        // 저장소 열기 시도
        Git git = Git.open(new File(request.getLocalpath()));

        // Git URI의 원격 저장소 연결
        git.remoteAdd().setName("origin").setUri(new URIish(request.getUrl())).call();

        // 파일을 스테이지에 추가
        git.add().addFilepattern(".").call();

        // 커밋
        git.commit().setMessage(request.getMessage()).call();

        // 푸시
        PushCommand pushCommand = git.push();
        pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(request.getUsername(), request.getToken()));
        pushCommand.setForce(true);
        pushCommand.call();

        // Git 객체 닫기
        git.close();
    }

    private void pushDir(GitPushRequest request) throws IOException, URISyntaxException, GitAPIException {
        // 저장소 열기 시도
        Git git = Git.open(new File(request.getLocalpath()));

        // Git URI의 원격 저장소 연결
        git.remoteAdd().setName("origin").setUri(new URIish(request.getUrl())).call();

        // 파일을 스테이지에 추가
        git.add().addFilepattern(".").call();

        // 커밋
        git.commit().setMessage(request.getMessage()).call();

        // 푸시
        PushCommand pushCommand = git.push();
        pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(request.getUsername(), request.getToken()));
        pushCommand.setForce(true);
        pushCommand.call();

        // Git 객체 닫기
        git.close();
    }

    @Override
    public boolean checkGitRepository(GitPushRequest request) {
        String url = request.getUrl();
        String username = request.getUsername();
        String token = request.getToken();

        try {
            Git.lsRemoteRepository()
                    .setHeads(true)
                    .setTags(true)
                    .setRemote(url)
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, token))
                    .call();
            return true;
        } catch (InvalidRemoteException e) {
            System.out.println("Invalid remote URL: " + e.getMessage());
        } catch (TransportException e) {
            if (e.getMessage().contains("Authentication is required") || e.getMessage().contains("not authorized")) {
                System.out.println("Invalid username or token.");
            } else if(e.getMessage().contains("Not Found")){
                System.out.println("Git URL does not exist in Github.");
            }else {
                System.out.println("Transport exception: " + e.getMessage());
            }
        } catch (GitAPIException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
