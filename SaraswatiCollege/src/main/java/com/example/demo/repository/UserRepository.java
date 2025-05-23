package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	 User findByUsername(String username);
	    User findByEmail(String email);
	    User findByUsernameAndPassword(String username, String password);
	    boolean existsByUsername(String username);

}
