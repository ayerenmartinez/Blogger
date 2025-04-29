package com.ayeren.blogger.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayeren.blogger.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    List<Post> findByUserId(Long id);
    List<Post> findByTitleContainingIgnoreCase(String title);
}
