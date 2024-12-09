package jgit.push.domain.repository;

import jgit.push.domain.entity.GitInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GitInfoRepository extends JpaRepository<GitInfo, Long> {
    GitInfo findByUsernameAndUrl(String username, String url);

    List<GitInfo> findAllByUsername(String username);
}
