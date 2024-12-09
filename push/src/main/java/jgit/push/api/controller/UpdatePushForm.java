package jgit.push.api.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UpdatePushForm {

    private String localpath;
    private String url;
    private String username;
    private String token;
    private String message;

}
