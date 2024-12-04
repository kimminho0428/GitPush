package jgit.push.api.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class GitPushRequest {

    private String url;
    private String username;
    private String token;
    private String message;

}
