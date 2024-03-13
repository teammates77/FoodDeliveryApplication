package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.entity.User;


import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserId(Integer userId);

	Optional<User> findByUsername(String username);
//	 Optional<UserInfo> findByName(String username);

}
