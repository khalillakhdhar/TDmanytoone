package com.http.tp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Post extends AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
@Lob
private String content;

@Size(max=250)
@NotNull
private String description;
@Column(unique = true,length = 100)
private String title;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}






}
