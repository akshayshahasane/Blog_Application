package com.example.Blog_App.repositories;

import com.example.Blog_App.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
