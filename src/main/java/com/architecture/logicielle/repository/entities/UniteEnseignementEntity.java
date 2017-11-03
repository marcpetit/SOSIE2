package com.architecture.logicielle.repository.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ue")
@Entity // This tells Hibernate to make a table out of this class
public class UniteEnseignementEntity implements Serializable {
	
	public UniteEnseignementEntity() {
		
	}
	
	
	@Id
	@Column(name = "identifiant")
    private String identifiant;

	@Column(name = "nom")
    private String nom;
	
	@Column(name = "enseignantResponsable")
	private String enseignantResponsable;
	
	@Column(name = "description")
    private String description;

	public UniteEnseignementEntity(String identifiant, String nom, String enseignantResponsable, String description) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.enseignantResponsable = enseignantResponsable;
		this.description = description;
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

	public String getEnseignantResponsable() {
		return enseignantResponsable;
	}

	public void setEnseignantResponsable(String enseignantResponsable) {
		this.enseignantResponsable = enseignantResponsable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UniteEnseignementEntity [identifiant=" + identifiant + ", nom=" + nom + ", enseignantResponsable="
				+ enseignantResponsable + ", description=" + description + "]";
	}
	
	

	
	
}
