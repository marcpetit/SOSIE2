package com.architecture.logicielle.repository.entities;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "promo")
@Entity // This tells Hibernate to make a table out of this class
public class PromoEntity {


	public PromoEntity() {
		
	}
	
	
	public PromoEntity(long promoID, String promoName, int year) {
		super();
		this.promoID = promoID;
		this.promoName = promoName;
		this.year = year;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long promoID;
	
	@Column(name = "promoName")
    private String promoName;

	@Column(name = "year")
    private int year;
	
//	@OneToMany(mappedBy="promoID")
//	private Set<UserEntity> student;

	public long getPromoID() {
		return promoID;
	}
	
	public String getPromoName() {
		return promoName;
	}

	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Name = " + this.getPromoName() + " | PromoID = " + this.getPromoID() + " | year = " + this.getYear();
	}
	

}
