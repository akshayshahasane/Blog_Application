package com.example.Blog_App.repositories;

import com.example.Blog_App.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
