package com.architecture.logicielle.repository.entities;

import java.io.File;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity // This tells Hibernate to make a table out of this class
public class UserEntity {
	
	public UserEntity() {}
	
	public UserEntity(long puid, String email, String password, String role, PromoEntity promoID) {
		this.email = email;
		this.password = password;
		this.puid = puid;
		this.role = role;
		this.promoID = promoID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long puid;
	
	@Column(name = "email")
	private String email;

    @Column(name = "password")
    private String password;
    
    @Column(name = "role")
    private String role;
    
    @OneToOne
    @JoinColumn(name = "promoID")
    private PromoEntity promoID;
    

    

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public long getPUID() {
		return puid;
	}

	public String getRole() {
		// TODO Auto-generated method stub
		return role;
	}
	
	public void setRole(String role) {
		// TODO Auto-generated method stub
		this.role = role;
	}
	
	public String toString() {
		return "Email = " + this.getEmail() + " | PUID = " + this.getPUID() + " | password = " + this.getPassword();
	}
	
	

}
