package jgit.push.domain.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class PushList {

    private Long id;
    private String localPath;
    private String url;
    private String username;
    private String encryptedToken;
    private String message;
    private String rawToken;
    private LocalDateTime createdDateTime;

}
