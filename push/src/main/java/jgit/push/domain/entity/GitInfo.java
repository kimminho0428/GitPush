package jgit.push.domain.entity;

import jakarta.persistence.*;
import jgit.push.config.AESUtil;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "git_info")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GitInfo extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "localpath")
    private String localPath;

    @Column(name = "url")
    private String url;

    @Column(name = "username")
    private String username;

    @Column(name = "token")
    private String encryptedToken;

    @Column(name = "message")
    private String message;

    @Transient
    private String rawToken;

    @Builder(toBuilder = true)
    public GitInfo(String localPath, String url, String username, String encryptedToken, String message) {
        this.localPath = localPath;
        this.url = url;
        this.username = username;
        this.encryptedToken = AESUtil.encrypt(encryptedToken);
        this.message = message;
    }

    @PostLoad
    private void decryptToken(){
        if (this.encryptedToken != null){
            this.rawToken = AESUtil.decrypt(this.encryptedToken);
        }
    }
}
