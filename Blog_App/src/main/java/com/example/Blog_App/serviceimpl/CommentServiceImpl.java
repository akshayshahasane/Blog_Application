package com.example.Blog_App.serviceimpl;

import com.example.Blog_App.dtos.CommentDto;
import com.example.Blog_App.entities.Comment;
import com.example.Blog_App.entities.Post;
import com.example.Blog_App.exceptions.ResourceNotFoundException;
import com.example.Blog_App.repositories.CommentRepository;
import com.example.Blog_App.repositories.PostRepository;
import com.example.Blog_App.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {

        Post post = this.postRepository.findById(Long.valueOf(postId))
                .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

        Comment comment = this.modelMapper.map(commentDto, Comment.class);

        comment.setPost(post);

        Comment savedComment = this.commentRepository.save(comment);

        return this.modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {

        Comment com = this.commentRepository.findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
        this.commentRepository.delete(com);

    }
}
