package jgit.push.api.service.impl;

import jgit.push.api.service.GitService;
import jgit.push.domain.dto.GitInfoDto;
import jgit.push.domain.dto.PushList;
import jgit.push.domain.entity.GitInfo;
import jgit.push.domain.repository.GitInfoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.stream.Collectors;

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
        String url = "https://github.com/test";
        String username = "test";
        String token = "abc";
        String message = "Hello";


        // when
        GitInfo savedGitInfo = gitInfoRepository.save(
                makeGitInfo(localpath, url, username, token, message)
        );
        GitInfo gitInfo = gitInfoRepository.findById(savedGitInfo.getId()).orElseThrow();

        // then
        assertThat(gitInfo.getLocalPath()).isEqualTo(localpath);
        assertThat(gitInfo.getUrl()).isEqualTo(url);
        assertThat(gitInfo.getUsername()).isEqualTo(username);
        assertThat(gitInfo.getRawToken()).isEqualTo(token);
        assertThat(gitInfo.getMessage()).isEqualTo(message);

    }

    @DisplayName("Git Push 정보 리스트를 화면에 출력하는지 테스트한다.")
    @Test
    void findPushList() {
        // given
        String localpath = "C:/test";
        String url = "https://github.com/test";
        String username = "test";
        String encryptedToken = "abc";
        String message = "Hello";
        GitInfo gitInfo = makeGitInfo(localpath, url, username, encryptedToken, message);
        gitInfoRepository.save(gitInfo);

        // when
        List<GitInfo> gitInfoList = gitInfoRepository.findAll();
        List<PushList> pushList = savePushList(gitInfoList);

        // then
        assertThat(pushList.get(0).getLocalPath()).isEqualTo(gitInfo.getLocalPath());
        assertThat(pushList.get(0).getUrl()).isEqualTo(gitInfo.getUrl());
        assertThat(pushList.get(0).getUsername()).isEqualTo(gitInfo.getUsername());
        assertThat(pushList.get(0).getEncryptedToken()).isEqualTo(gitInfo.getEncryptedToken());
        assertThat(pushList.get(0).getMessage()).isEqualTo(gitInfo.getMessage());
    }

    @DisplayName("Git 유저명을 파라미터로 사용하여 DB에서 Push 정보를 조회하는지 테스트한다.")
    @Test
    void findPushListByName() {
        // given
        String localpath = "C:/test";
        String url = "https://github.com/test";
        String username = "test";
        String encryptedToken = "abc";
        String message = "Hello";
        GitInfo gitInfo = makeGitInfo(localpath, url, username, encryptedToken, message);
        gitInfoRepository.save(gitInfo);

        // when
        List<GitInfo> gitInfoList = gitInfoRepository.findAllByUsername(username);
        List<PushList> pushList = savePushList(gitInfoList);

        // then
        assertThat(pushList.get(0).getLocalPath()).isEqualTo(gitInfo.getLocalPath());
        assertThat(pushList.get(0).getUrl()).isEqualTo(gitInfo.getUrl());
        assertThat(pushList.get(0).getUsername()).isEqualTo(gitInfo.getUsername());
        assertThat(pushList.get(0).getEncryptedToken()).isEqualTo(gitInfo.getEncryptedToken());
        assertThat(pushList.get(0).getMessage()).isEqualTo(gitInfo.getMessage());
    }

    @DisplayName("Git 유저명과 Url을 파라미터로 사용하여 DB에서 Push 정보를 조회하는지 테스트한다.")
    @Test
    void findByNameAndUrl() {
        // given
        String localpath = "C:/test";
        String url = "https://github.com/test";
        String username = "test";
        String encryptedToken = "abc";
        String message = "Hello";
        GitInfo gitInfo = makeGitInfo(localpath, url, username, encryptedToken, message);
        gitInfoRepository.save(gitInfo);

        // when
        gitInfoRepository.findByUsernameAndUrl(username, url);
        GitInfoDto gitInfoDto = makeGitInfoDto(gitInfo);

        // then
        assertThat(gitInfoDto.getLocalPath()).isEqualTo(gitInfo.getLocalPath());
        assertThat(gitInfoDto.getUrl()).isEqualTo(gitInfo.getUrl());
        assertThat(gitInfoDto.getUsername()).isEqualTo(gitInfo.getUsername());
        assertThat(gitInfoDto.getRawToken()).isEqualTo(gitInfo.getRawToken());
        assertThat(gitInfoDto.getMessage()).isEqualTo(gitInfo.getMessage());
    }

    @DisplayName("Id를 파라미터로 사용하여 Git Push 정보를 DB에서 삭제하는지 테스트한다.")
    @Test
    void deletePushList(){
        // given
        Long id = 1L;
        String localpath = "C:/test";
        String url = "https://github.com/test";
        String username = "test";
        String token = "abc";
        String message = "Hello";


        // when
        GitInfo gitInfo = gitInfoRepository.save(
                makeGitInfo(localpath, url, username, token, message)
        );
        gitInfoRepository.deleteById(id);

        // then
        assertThat(gitInfoRepository.findById(id)).isNotPresent();
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

    private GitInfo makeGitInfo(String localpath, String url, String username, String encryptedToken, String message) {
        return GitInfo.builder()
                .localPath(localpath)
                .url(url)
                .username(username)
                .encryptedToken(encryptedToken)
                .message(message)
                .build();
    }

    private List<PushList> savePushList(List<GitInfo> gitInfoList) {
        return gitInfoList.stream()
                .map(gitInfo -> PushList.builder()
                        .id(gitInfo.getId())
                        .localPath(gitInfo.getLocalPath())
                        .url(gitInfo.getUrl())
                        .username(gitInfo.getUsername())
                        .encryptedToken(gitInfo.getEncryptedToken())
                        .rawToken(gitInfo.getRawToken())
                        .createdDateTime(gitInfo.getCreatedDateTime())
                        .message(gitInfo.getMessage())
                        .build())
                .collect(Collectors.toList());
    }
}