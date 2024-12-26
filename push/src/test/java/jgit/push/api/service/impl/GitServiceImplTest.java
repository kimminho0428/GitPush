package jgit.push.api.service.impl;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import jgit.push.domain.entity.GitInfo;
import jgit.push.domain.repository.GitInfoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class GitServiceImplTest {

    @Autowired
    private GitService gitService;

    @Autowired
    private GitInfoRepository gitInfoRepository;

    @DisplayName("Git Push 정보가 DB에 저장되는지 테스트한다.")
    @Test
    void saveGitPushInfo() {
        // given
        String localpath = "C:/test";
        String url = "https://github.com/kimminho0428/GitPush";
        String username = "kimminho0428";
        String token = "abc";
        String message = "Test";


        //when
        GitInfo savedGitInfo = gitInfoRepository.save(
                GitInfo.builder()
                        .localPath(localpath)
                        .url(url)
                        .username(username)
                        .encryptedToken(token)
                        .message(message)
                        .build()
        );

        GitInfo gitInfo = gitInfoRepository.findById(savedGitInfo.getId()).orElseThrow();

        // then
        assertThat(gitInfo.getLocalPath()).isEqualTo(localpath);
        assertThat(gitInfo.getUrl()).isEqualTo(url);
        assertThat(gitInfo.getUsername()).isEqualTo(username);
        assertThat(gitInfo.getRawToken()).isEqualTo(token);
        assertThat(gitInfo.getMessage()).isEqualTo(message);

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