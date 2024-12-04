package jgit.push.api.service.impl;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.errors.RepositoryNotFoundException;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@Service
public class GitServiceImpl implements GitService {

    @Override
    public void pushGithub(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException {
        String localPath = "C:\\docker\\TEST";
        try{
            pushDir(request, localPath);
        } catch (RepositoryNotFoundException e){
            initRepoWithPush(request, localPath);
        }
    }

    private void initRepoWithPush(GitPushRequest request, String localPath) throws GitAPIException, IOException, URISyntaxException {
        // 새 저장소 초기화
        Git.init().setDirectory(new File(localPath)).call();

        // 저장소 열기 시도
        Git git = Git.open(new File(localPath));

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
        System.out.println("Push Success");

        // Git 객체 닫기
        git.close();
    }

    private void pushDir(GitPushRequest request, String localPath) throws IOException, URISyntaxException, GitAPIException {
        // 저장소 열기 시도
        Git git = Git.open(new File(localPath));

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
