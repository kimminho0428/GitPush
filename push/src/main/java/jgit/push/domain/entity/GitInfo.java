package jgit.push.domain.entity;

import jakarta.persistence.*;
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
    private Long id;

    @Column
    private String url;

    @Column
    private String username;

    @Builder
    public GitInfo(String url, String username) {
        this.url = url;
        this.username = username;
    }
}
