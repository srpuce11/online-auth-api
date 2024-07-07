package com.online_auth_api.online_auth_api.repository;

import com.online_auth_api.online_auth_api.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByEmailAndPassword(String email, String password);

}
