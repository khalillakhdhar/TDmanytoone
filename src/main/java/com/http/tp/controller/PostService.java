package com.http.tp.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.http.tp.repositories.PostRepository;
import com.http.tp.entities.Post;
import com.http.tp.exception.RessourceNotFoundException;
@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	public List<Post> getPosts()
	{
		return  postRepository.findAll();
		
	}
	public Post createPost(Post post)
	{
		
		return postRepository.save(post);
	}
	public ResponseEntity<?> deletePost(Long postId)
	{
		return postRepository.findById(postId).map(post->{
			postRepository.delete(post);
			return ResponseEntity.ok().build();
		}).orElseThrow(()->new RessourceNotFoundException("PostId "+postId+" not found"));
	}
	
	
	
}
