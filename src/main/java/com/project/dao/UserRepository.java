package com.project.dao;

import com.project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Integer> {
    List<User> findByEmail(String email);
}