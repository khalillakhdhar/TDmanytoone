package com.http.tp.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;

@Entity
public class Comment extends AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Lob
@NotNull
private String content;
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "post_id", nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@JsonIdentityReference(alwaysAsId=true)
@JsonProperty("post_id")
private Post post;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Post getPost() {
	return post;
}
public void setPost(Post post) {
	this.post = post;
}





}
