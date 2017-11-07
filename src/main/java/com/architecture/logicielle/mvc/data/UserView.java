package com.architecture.logicielle.mvc.data;

import java.io.File;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserView {
	
	public UserView() {
		
	}
	
	public UserView(UserView usr1, UserView usr2) {
		usr1.firstName = usr2.firstName;
		usr1.lastName = usr2.lastName;
		usr1.statut = usr2.statut;
		usr1.email = usr2.email;
		usr1.password = usr2.password;
		usr1.photo = usr2.photo;
	}

	public UserView(String firstName, String lastName, String statut, String mail, String password, File photo, Long username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.statut = statut;
		this.email = mail;
		this.username = username;
		this.password = password;
		this.photo = photo;
	}

	@NotNull
    @Size(min=2, max=30, message = "*Please provide a valid firstName")
    private String firstName;
	
	@NotNull
    @Size(min=2, max=30)
    private String lastName;
	
	@Id
    private Long username;
	
	public Long getUsername() {
		return username;
	}

	public void setUsername(Long username) {
		this.username = username;
	}

	@NotNull
    @Size(min=2, max=30)
    private String statut;

    @NotNull
    private String email;

    
    @NotNull
    private String password;

    @NotNull
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
}
