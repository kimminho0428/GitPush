package jgit.push.domain.repository;

import jgit.push.domain.entity.GitInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitInfoRepository extends JpaRepository<GitInfo, Long> {
}
