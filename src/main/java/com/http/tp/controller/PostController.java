package com.http.tp.controller;

import java.awt.print.Pageable;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.http.tp.entities.Post;
@RestController
public class PostController {
@Autowired
PostService postService;
@GetMapping("posts")
public List<Post> getAllPosts()
{
	return postService.getPosts();
	
}
@PostMapping("posts")
public Post createOnePost(@Valid @RequestBody Post post) //verifie l'instance avant l'envoie à la BD
{
return postService.createPost(post);	
}
@DeleteMapping("posts/{postId}")
public ResponseEntity<?> deletePost(@PathVariable(value = "postId") Long PostId)
{
return postService.deletePost(PostId);	

}
}
