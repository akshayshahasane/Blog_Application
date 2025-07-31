package com.example.Blog_App.repositories;

import com.example.Blog_App.entities.Category;
import com.example.Blog_App.entities.Post;
import com.example.Blog_App.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategory(Category category);
    List<Post> findByUser(User user);
}
