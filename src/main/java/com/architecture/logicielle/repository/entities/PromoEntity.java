package com.architecture.logicielle.repository.entities;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import antlr.collections.List;

@Table(name = "promo")
@Entity // This tells Hibernate to make a table out of this class
public class PromoEntity {


	public PromoEntity() {
		
	}
	
	
	public PromoEntity(long promoID, String promoName, int year, ArrayList<Long> students ) {
		super();
		this.promoID = promoID;
		this.promoName = promoName;
		this.year = year;
		this.students = students;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long promoID;
	
	@Column(name = "promoName")
    private String promoName;

	@Column(name = "year")
    private int year;
	
	@Column(name = "students")
	private ArrayList<Long> students;

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

	public ArrayList<Long> getEleves() {
		return students;
	}

	public void setEleves(ArrayList<Long> students) {
		this.students = students;
	}

}
