package com.architecture.logicielle.mvc.data;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StageView {
	
	public StageView() {
		
	}
	
	public StageView(StageView stg1, StageView stg2) {

		stg1.sujet = stg2.sujet;
		stg1.dateDebut = stg2.dateFin;
		stg1.dateFin = stg2.dateFin;
		stg1.nomEntreprise = stg2.nomEntreprise;
		stg1.usernameEnseignantReferant = stg2.usernameEnseignantReferant;
		stg1.usernameEleve = stg2.usernameEleve;
		
	}

	public StageView(long idStage, String sujet, String nomEntreprise, 
			Date dateDebut, Date dateFin, Long username,Long usernameEleve) {
		super();
		this.idStage = idStage;
		this.sujet = sujet;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nomEntreprise = nomEntreprise;
		this.usernameEnseignantReferant = username;
		this.usernameEleve = usernameEleve;
	}

	@Id
    private long idStage;
	
	/**
	 * @return the idStage
	 */
	public long getIdStage() {
		return idStage;
	}

	/**
	 * @param idStage the idStage to set
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
	 * @param sujet the sujet to set
	 */
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

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
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
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
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the usernameEnseignantReferant
	 */
	public Long getUsernameEnseignantReferant() {
		return usernameEnseignantReferant;
	}

	/**
	 * @param usernameEnseignantReferant the usernameEnseignantReferant to set
	 */
	public void setUsernameEnseignantReferant(Long usernameEnseignantReferant) {
		this.usernameEnseignantReferant = usernameEnseignantReferant;
	}

	@NotNull
    @Size(min=1, max=30)
    private String sujet;
	
	@NotNull
    @Size(min=2, max=30)
    private String nomEntreprise;

    @NotNull
    private Date dateDebut;
        
    /**
	 * @return the usernameEleve
	 */
	public Long getUsernameEleve() {
		return usernameEleve;
	}

	/**
	 * @param usernameEleve the usernameEleve to set
	 */
	public void setUsernameEleve(Long usernameEleve) {
		this.usernameEleve = usernameEleve;
	}

	@NotNull
    private Date dateFin;
    
    @NotNull
    private Long usernameEnseignantReferant;
    
    private Long usernameEleve;

}
