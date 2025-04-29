package com.ayeren.blogger.services;

import java.util.List;
import java.util.Optional;

import com.ayeren.blogger.entities.Post;

public interface PostService {
    
    List<Post> getAllPosts();
    Optional<Post> getPostById(Long id);
    List<Post> getPostByUserId(Long userId);
    void createPost(Post post);
    void updatePost(Long id, Post post);
    void deletePostById(Long id);
    List<Post> searchPostByTitle(String title);
} 
