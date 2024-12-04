package jgit.push.api.service;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.domain.entity.GitInfo;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface GitService {

    void pushGithub(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException;

    void saveGitPushInfo(GitPushRequest request);

    List<GitInfo> findPushList();

}
