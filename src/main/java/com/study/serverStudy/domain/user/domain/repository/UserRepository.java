package com.study.serverStudy.domain.user.domain.repository;

import com.study.serverStudy.domain.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
