package com.http.tp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.tp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
List<Comment> findByPostId(long postId);
Optional<Comment> findByIdAndPostId(long id,long postId);
}
