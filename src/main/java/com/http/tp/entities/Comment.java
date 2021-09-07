package com.http.tp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.sun.istack.NotNull;

@Entity
public class Comment extends AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Lob
@NotNull
private String content;






}
