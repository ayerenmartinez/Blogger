package com.ayeren.blogger.services;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayeren.blogger.entities.Post;
import com.ayeren.blogger.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository repository;

    @Override
    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    @Override
    public Optional<Post> getPostById(Long id) {
       return repository.findById(id);
    }

    @Override
    public List<Post> getPostByUserId(Long userId) {
       return repository.findByUserId(userId);
    }

    @Override
    public void createPost(Post post) {
       repository.save(post);
    }

    @Override
    public void updatePost(Long id, Post post) {
       Post postExistente = getPostById(id).orElseThrow(()->new InvalidParameterException("Invalid post id"));
       postExistente.setTitle(post.getTitle());
       postExistente.setContent(post.getContent());
       repository.save(postExistente);
    }

    @Override
    public void deletePostById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Post> searchPostByTitle(String title) {
       return repository.findByTitleContainingIgnoreCase(title);
    }

}
