package com.architecture.logicielle.repository.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Table(name = "stage")
@Entity
public class Stage {

	/**
	 * Identifiant unique du stage
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	@Column(name = "ID_STAGE")
	private long idStage;

	/**
	 * Le sujet du stage
	 */
	@Column(name = "SUJET")
	private String sujet;
	/**
	 * La date de début du stage
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEBUT")
	private Date dateDebut;
	/**
	 * La date de fin du stage
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN")
	private Date dateFin;
	/**
	 * Le nom de l'entreprise où se déroulera le stage
	 */
	@Column(name = "NOM_ENTREPRISE")
	private String nomEntreprise;

	/**
	 * Eleve passant le stage
	 */
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="ELEVE")
	private UserEntity eleve;
	
	/**
	 * Encadrant de l'eleve pendant le stage
	 */
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="ENSEIGNANT_REFERANT")
	private UserEntity enseignantReferant;
	
	/**
	 * @return the nomEntreprise
	 */
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	/**
	 * @param nomEntreprise the nomEntreprise to set
	 */
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	/**
	 * @return the eleve
	 */
	public UserEntity getEleve() {
		return eleve;
	}

	/**
	 * @param eleve the eleve to set
	 */
	public void setEleve(UserEntity eleve) {
		this.eleve = eleve;
	}

	/**
	 * @return the enseignantReferant
	 */
	public UserEntity getEnseignantReferant() {
		return enseignantReferant;
	}

	/**
	 * @param enseignantReferant the enseignantReferant to set
	 */
	public void setEnseignantReferant(UserEntity enseignantReferant) {
		this.enseignantReferant = enseignantReferant;
	}

	/**
	 * @return the idStage
	 */
	public long getIdStage() {
		return idStage;
	}

	/**
	 * @param idStage
	 *            the idStage to set
	 */
	public void setIdStage(long idStage) {
		this.idStage = idStage;
	}

	/**
	 * @return the sujet
	 */
	public String getSujet() {
		return sujet;
	}

	/**
	 * @param sujet
	 *            the sujet to set
	 */
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut
	 *            the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
