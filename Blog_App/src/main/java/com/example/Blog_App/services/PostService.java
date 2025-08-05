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

    PostDto updatePost(PostDto postDto, Integer postId);

    //delete

    void deletePost(Integer postId);

    //get all post

    List<PostDto> getAllPosts(Integer pageNumber, Integer pageSize);

    //get single post

    PostDto getPostById(Integer postId);

    // get all post by category

    List<PostDto> getPostsByCategory(Integer categoryId);

    //get all post by user

    List<PostDto> getPostsByUser(Integer userId);

    //search posts

    List<Post> searchPosts(String keyword);
}
