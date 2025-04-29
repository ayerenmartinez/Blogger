package com.ayeren.blogger.services;

import java.util.Optional;

import com.ayeren.blogger.entities.Comment;

public interface CommentService {
    Optional<Comment> getCommentById(Long id);
    void createComment(Comment comment);
    void updateComment(Long id, Comment comment);
    void deleteComment(Long id);
}
