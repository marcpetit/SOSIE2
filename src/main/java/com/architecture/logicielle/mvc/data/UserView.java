package com.architecture.logicielle.mvc.data;

import javax.validation.constraints.NotNull;


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

	public long getPUID() {
		return puid;
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
	
	public String toString() {
		return "Email = " + this.getEmail() + " | PUID = " + this.getPUID() + " | password = " + this.getPassword();
	}

}
