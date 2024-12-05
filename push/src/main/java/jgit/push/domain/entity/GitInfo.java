package jgit.push.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

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
    private String token;

    @Column(name = "message")
    private String message;

    public GitInfo(String localPath, String url, String username, String token, String message) {
        this.localPath = localPath;
        this.url = url;
        this.username = username;
        this.token = token;
        this.message = message;
    }
}
