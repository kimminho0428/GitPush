package jgit.push.api.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PushForm {

    private String url;
    private String username;
    private String token;
    private String message;

}
