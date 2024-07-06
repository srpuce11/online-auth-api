package com.online_auth_api.online_auth_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online_auth_api.online_auth_api.repository.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User getUserByEmailAndPassword(String userName, String password);
	
}
