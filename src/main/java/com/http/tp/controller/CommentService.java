package com.http.tp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.http.tp.repositories.CommentRepository;
import com.http.tp.repositories.PostRepository;
import com.http.tp.entities.Comment;
import com.http.tp.exception.RessourceNotFoundException;

@Service
public class CommentService {
@Autowired 
CommentRepository commentRepository;
@Autowired
PostRepository postRepository;
public List<Comment> getCommentByPost(long postid)
{
	return commentRepository.findByPostId(postid);

}
public Comment createOneComment(long postid,Comment comment)
{
return postRepository.findById(postid).map(post->{
	comment.setPost(post);
return commentRepository.save(comment);
}).orElseThrow(()-> new RessourceNotFoundException("PostId"+postid+" not found"));

}
public ResponseEntity<?> deletePost(Long postId,long commentId)
{
	return commentRepository.findByIdAndPostId(commentId, postId).map(comment->{commentRepository.delete(comment);
	return ResponseEntity.ok().build();
	}).orElseThrow(()->new RessourceNotFoundException("Comment "+commentId+" not found"));
}
}
