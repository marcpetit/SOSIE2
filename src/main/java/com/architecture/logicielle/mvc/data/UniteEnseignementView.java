package com.architecture.logicielle.mvc.data;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.architecture.logicielle.repository.entities.UserEntity;

import javax.persistence.Id;


public class UniteEnseignementView {
	
	
	@NotNull
	@Id
    @Size(min=2, max=30, message = "*Please provide a valid identifiant")
    private String identifiant;
	
	@NotNull
    @Size(min=2, max=30)
    private String nom;

	@NotNull
    @Size(min=2, max=30)
    private String firstname;
	
	@NotNull
    @Size(min=2, max=30)
    private String lastname;

    @NotNull
    private String description;
    
    
	
	
	
	
	
	public UniteEnseignementView(UniteEnseignementView ue1, UniteEnseignementView ue2) {
		ue1.identifiant = ue2.identifiant;
		ue1.nom = ue2.nom;
		ue1.firstname = ue2.firstname;
		ue1.lastname = ue2.lastname;
		ue1.description = ue2.description;
	}

	public UniteEnseignementView() {
		super();
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UniteEnseignementView [identifiant=" + identifiant + ", nom=" + nom + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", description=" + description + "]";
	}



	

	
	
	
}
