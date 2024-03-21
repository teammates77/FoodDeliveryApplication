package com.application.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.application.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	com.application.entity.User findByEmail(String email);
}