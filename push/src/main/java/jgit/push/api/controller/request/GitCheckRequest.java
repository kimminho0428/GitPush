package jgit.push.api.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class GitCheckRequest {

    private String url;
    private String username;
    private String token;

}
