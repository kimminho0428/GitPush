package jgit.push.api.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitPushRequest {

    private String url;
    private String username;
    private String token;
    private String message;

}
