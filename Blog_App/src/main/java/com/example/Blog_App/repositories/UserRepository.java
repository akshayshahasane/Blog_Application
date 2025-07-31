package com.example.Blog_App.repositories;

import com.example.Blog_App.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
