package com.architecture.logicielle.mvc.data;


import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
    
	public UniteEnseignementView(String identifiant, String nom, String firstname, String lastname,
			String description) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.firstname = firstname;
		this.lastname = lastname;
		this.description = description;
	}
    

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((identifiant == null) ? 0 : identifiant.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		UniteEnseignementView other = (UniteEnseignementView) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (identifiant == null) {
			if (other.identifiant != null)
				return false;
		} else if (!identifiant.equals(other.identifiant))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

}
