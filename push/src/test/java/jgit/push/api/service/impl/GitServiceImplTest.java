package jgit.push.api.service.impl;

import jgit.push.api.service.GitService;
import jgit.push.domain.entity.GitInfo;
import jgit.push.domain.repository.GitInfoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GitServiceImplTest {

    @Spy
    private final GitService gitService;

    @Spy
    private final GitInfoRepository gitInfoRepository;

    @Autowired
    private GitServiceImpl gitServiceImpl;

    GitServiceImplTest(GitService gitService, GitInfoRepository gitInfoRepository) {
        this.gitService = gitService;
        this.gitInfoRepository = gitInfoRepository;
    }


    @Test
    void saveGitPushInfo() {
        // given
        String token = "abc";
        String localpath = "C:/test";
        String url = "https://github.com/kimminho0428/GitPush";
        String username = "kimminho0428";
        String message = "Test";

        // when
        GitInfo gitInfo = gitInfoRepository.save(new GitInfo(token, localpath, url, username, message));

        // then
        assertThat(gitInfo)
                .extracting("token", "loaclpath", "url", "username", "message")
                .contains(
                  tuple("abc", "C:/test", "https://github.com/kimminho0428/GitPush", "kimminho0428", "Test")
                );

    }

    @Test
    void findPushList() {
    }

    @Test
    void findPushListByName() {
    }

    @Test
    void findByNameAndUrl() {
    }
}