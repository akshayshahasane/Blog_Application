package com.example.Blog_App.dtos;

import com.example.Blog_App.entities.Category;
import com.example.Blog_App.entities.Comment;
import com.example.Blog_App.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private Integer postId;

    private String title;

    private String content;

    private String imageName;

    private Date addedDate;

    private UserDto user;

    private CategoryDto category;

    private Set<CommentDto> comments = new HashSet<>();
}
