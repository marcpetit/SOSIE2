package com.architecture.logicielle.mvc.data;

import java.util.Set;
import javax.validation.constraints.NotNull;

import com.architecture.logicielle.repository.entities.UserEntity;


public class PromoView {
	
	public PromoView() {
		
	}
	
	public PromoView(PromoView promo1, PromoView promo2) {
		
	}

	public PromoView(long promoID, String promoName, int year) {
		super();
		this.promoID = promoID;
		this.promoName = promoName;
		this.year = year;
	}
	
	@NotNull
	private long promoID;
	
	@NotNull
    private String promoName;

	@NotNull
	private int year;
	
	//@NotNull
	//private Set<UserEntity> student;

	public String getPromoName() {
		return promoName;
	}

	public void setPromoID(long promoID) {
		this.promoID = promoID;
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
}