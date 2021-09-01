package com.codeup.blogapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    Optional<User> findByEmail(String email);

}
