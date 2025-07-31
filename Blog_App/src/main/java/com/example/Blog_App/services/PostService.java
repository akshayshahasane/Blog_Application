package com.example.Blog_App.services;

import com.example.Blog_App.dtos.PostDto;
import com.example.Blog_App.entities.Category;
import com.example.Blog_App.entities.Post;
import com.example.Blog_App.entities.User;

import java.util.List;

public interface PostService {

    //create

    PostDto create(PostDto postDto, Integer userId, Integer categoryId);

    //update

    Post updatePost(PostDto postDto, Integer postId);

    //delete

    void deletePost(Integer postId);

    //get all post

    List<Post> getAllPosts();

    //get single post

    Post getPostById(Integer postId);

    // get all post by category

    List<Post> getPostsByCategory(Category categoryId);

    //get all post by user

    List<Post> getPostsByUser(User userId);

    //search posts

    List<Post> searchPosts(String keyword);
}
