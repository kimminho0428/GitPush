package jgit.push.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jgit.push.api.service.GitService;
import jgit.push.domain.dto.GitInfoDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PushController.class)
class PushControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private GitService gitService;

    @DisplayName("유저명을 사용하여 DB에서 값을 제대로 조회하는지를 테스트한다.")
    @WithMockUser(username = "testUser")
    @Test
    void searchGitPushInfoUsername() throws Exception {
        // given
        String username = "username";

        // when, then
        mockMvc.perform(
                        post("/push/search")
                                .param("username", username)
                                .with(csrf())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @DisplayName("유저명을 사용하여 DB에서 값을 제대로 조회하는지를 테스트한다. 이때 Form 클래스를 활용한다.")
    @WithMockUser(username = "testUser")
    @Test
    void searchGitPushInfoUsernameWithForm() throws Exception {
        // given
        String username = "username";
        SearchForm searchForm = new SearchForm();
        searchForm.setUsername(username);

        // then
        mockMvc.perform(
                        post("/push/search")
                                .flashAttr("SearchForm", searchForm)
                                .with(csrf())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @DisplayName("새로운 Git Push를 수행하기 전 유저명과 Url을 사용하여 DB에서 값을 제대로 조회하는지를 테스트한다.")
    @WithMockUser(username = "testUser")
    @Test
    void searchGitPushInfoUsernameAndUrl() throws Exception {
        // given
        String localPath = "localPath";
        String username = "username";
        String url = "https://github.com/test";
        String rawToken = "abc";
        String message = "commit message";
        GitInfoDto gitInfoDto = makeGitInfoDto(localPath, username, url, rawToken, message);

        // when
        when(gitService.findByNameAndUrl(username, url)).thenReturn(gitInfoDto);

        // then
        mockMvc.perform(
                        get("/push/edit")
                                .param("username", username)
                                .param("url", url)
                                .with(csrf())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    private GitInfoDto makeGitInfoDto(String localPath, String url, String username, String rawToken, String message) {
        return GitInfoDto.builder()
                .localPath(localPath)
                .url(url)
                .username(username)
                .rawToken(rawToken)
                .message(message)
                .build();
    }


}