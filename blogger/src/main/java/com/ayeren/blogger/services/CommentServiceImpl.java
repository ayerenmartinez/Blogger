package com.ayeren.blogger.services;

import java.security.InvalidParameterException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayeren.blogger.entities.Comment;
import com.ayeren.blogger.repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{

    private final CommentRepository repository;


    public CommentServiceImpl(CommentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Comment> getCommentById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void createComment(Comment comment) {
       repository.save(comment);
    }

    @Override
    public void updateComment(Long id, Comment comment) {
       Comment commentDB = getCommentById(id).orElseThrow(()->new InvalidParameterException("Invalid comment id"));
       commentDB.setContent(comment.getContent());
       repository.save(commentDB);
    }

    @Override
    public void deleteComment(Long id) {
       repository.deleteById(id);
    }

}
