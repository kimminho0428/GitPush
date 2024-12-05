package jgit.push.api.service.impl;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import jgit.push.config.PasswordConfig;
import jgit.push.domain.entity.GitInfo;
import jgit.push.domain.repository.GitInfoRepository;
import lombok.RequiredArgsConstructor;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void pushGithub(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException {
        try{
            pushDir(request);
        } catch (RepositoryNotFoundException e){
            initRepoWithPush(request);
        }
    }

    @Transactional
    @Override
    public void saveGitPushInfo(GitPushRequest request) {

        System.out.println("request.getToken() = " + request.getToken());
        String encodeToken = passwordEncoder.encode(request.getToken());
        System.out.println("encodeToken = " + encodeToken);

        gitInfoRepository.save(new GitInfo(
                request.getLocalpath(),
                request.getUrl(),
                request.getUsername(),
                encodeToken,
                request.getMessage()
        ));

    }

    @Override
    public List<GitInfo> findPushList() {
        return gitInfoRepository.findAll();
    }

    @Override
    public GitInfo findByName(String username) {
        return gitInfoRepository.findByUsername(username);
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
}
