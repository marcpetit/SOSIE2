package com.architecture.logicielle.mvc.data;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    private String enseignantResponsable;

    @NotNull
    private String description;
	
	
	
	public UniteEnseignementView() {
		
	}
	
	public UniteEnseignementView(UniteEnseignementView ue1, UniteEnseignementView ue2) {
		ue1.identifiant = ue2.identifiant;
		ue1.nom = ue2.nom;
		ue1.enseignantResponsable = ue2.enseignantResponsable;
		ue1.description = ue2.description;
	}

	public UniteEnseignementView(String identifiant, String nom, String enseignantResponsable, String description) {
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
		return "UniteEnseignementView [identifiant=" + identifiant + ", nom=" + nom + ", enseignantResponsable="
				+ enseignantResponsable + ", description=" + description + "]";
	}

	
	
	
}
