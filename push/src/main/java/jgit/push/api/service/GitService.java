package jgit.push.api.service;

import jgit.push.api.controller.request.GitPushRequest;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.IOException;
import java.net.URISyntaxException;

public interface GitService {

    void pushGithub(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException;

}
