package jgit.push.api.service;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.domain.dto.GitInfoDto;
import jgit.push.domain.dto.PushList;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public interface GitService {

    void pushGithub(GitPushRequest request) throws GitAPIException, IOException, URISyntaxException;

    void saveGitPushInfo(GitPushRequest request);

    Map<String, String> checkGitRepository(GitPushRequest request);

    List<PushList> findPushList();

    List<PushList> findPushListByName(String username);

    GitInfoDto findByNameAndUrl(String username, String url);

}
