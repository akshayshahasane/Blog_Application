package com.example.Blog_App.services;

import com.example.Blog_App.dtos.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);
}
