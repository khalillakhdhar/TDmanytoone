package com.http.tp.repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.http.tp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {



}
