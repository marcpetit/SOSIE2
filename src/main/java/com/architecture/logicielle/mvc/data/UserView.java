package com.architecture.logicielle.mvc.data;

import java.io.File;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class UserView {
	
	public UserView() {
		
	}
	
	public UserView(UserView usr1, UserView usr2) {
		usr1.email = usr2.email;
		usr1.password = usr2.password;
	}

	public UserView(long puid, String email, String password, String role) {
		this.puid = puid;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	
	@NotNull
	private long puid;
	
    @NotNull
    private String email;
    
    @NotNull
    private String password;
    
    @NotNull
    private String role;

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

	public void setPUID(long puid) {
		this.puid = puid;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	
	

	
}
