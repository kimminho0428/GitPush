package jgit.push.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GitInfoDto {

    private String localPath;
    private String url;
    private String username;
    private String rawToken;
    private String message;


}
