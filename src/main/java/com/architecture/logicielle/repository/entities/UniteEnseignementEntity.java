package com.architecture.logicielle.repository.entities;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "ue")
@Entity // This tells Hibernate to make a table out of this class
public class UniteEnseignementEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "identifiant")
    private String identifiant;

	@Column(name = "nom")
    private String nom;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="enseignantResponsable")
	private UserEntity enseignantResponsable;
	
	@Column(name = "description")
    private String description;

	public UniteEnseignementEntity(String identifiant, String nom, UserEntity enseignantResponsable,
			String description) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.enseignantResponsable = enseignantResponsable;
		this.description = description;
	}

	

	public UniteEnseignementEntity() {
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

	public UserEntity getEnseignantResponsable() {
		return enseignantResponsable;
	}

	public void setEnseignantResponsable(UserEntity enseignantResponsable) {
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enseignantResponsable == null) ? 0 : enseignantResponsable.hashCode());
		result = prime * result + ((identifiant == null) ? 0 : identifiant.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniteEnseignementEntity other = (UniteEnseignementEntity) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (enseignantResponsable == null) {
			if (other.enseignantResponsable != null)
				return false;
		} else if (!enseignantResponsable.equals(other.enseignantResponsable))
			return false;
		if (identifiant == null) {
			if (other.identifiant != null)
				return false;
		} else if (!identifiant.equals(other.identifiant))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	
}
