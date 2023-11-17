package com.example.java_project.repo;

import com.example.java_project.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    Users getUserByUsername(String username);
}
