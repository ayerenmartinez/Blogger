package com.ayeren.blogger.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayeren.blogger.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{
    List<Comment> findByPostId(Long post);
}
