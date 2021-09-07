package com.http.tp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import com.sun.istack.NotNull;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Email
@NotNull
private String email;
private String mdp,nom,tel,adresse,grade;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}





}
