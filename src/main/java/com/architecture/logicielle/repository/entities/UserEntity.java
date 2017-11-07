package com.architecture.logicielle.repository.entities;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity // This tells Hibernate to make a table out of this class
public class UserEntity {
	
	public UserEntity() {
		
	}
	
	public UserEntity(String firstName, String lastName, String statut, String mail, String password, File photo, Long username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.statut = statut;
		this.email = mail;
		this.password = password;
		this.photo = photo;
		this.username = username;
	}

	@Column(name = "firstName")
    private String firstName;

	@Column(name = "lastName")
    private String lastName;
	
	@Id
	@Column(name = "username")
	private Long username;
	
	@Column(name = "statut") String statut;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;

    @Column(name = "photo")
    private File photo;
    

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getMail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Long getUsername() {
		return username;
	}

	public void setUsername(Long username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
