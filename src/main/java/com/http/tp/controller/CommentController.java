package com.http.tp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.tp.entities.Comment;

@RestController
@RequestMapping("comments")
public class CommentController {
@Autowired
CommentService commentService;
@GetMapping("/{postId}/comments")
public List<Comment> getAllCommentsByPostId(@PathVariable(value="postId") long postid)
{
	return commentService.getCommentByPost(postid);

}
@PostMapping("/{postId}/comments")
public Comment addComment(@PathVariable(value="postId") long postid, @Valid @RequestBody Comment comment)
{
return commentService.createOneComment(postid, comment);	

}
@DeleteMapping("/posts/{postId}/comments/{commentId}")
public ResponseEntity<?> deleteMyComment(@PathVariable(value="postId") long postid,@PathVariable(value="commentId") long commentid)
{
	return commentService.deletePost(postid, commentid);

}

}
