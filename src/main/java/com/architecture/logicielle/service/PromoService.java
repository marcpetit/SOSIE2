package com.architecture.logicielle.service;

import com.architecture.logicielle.mvc.data.PromoView;
import com.architecture.logicielle.repository.PromoRepository;
import com.architecture.logicielle.repository.entities.PromoEntity;


public interface PromoService {

	public PromoEntity parsePromoViewToPromoEntity(PromoView promoView);  
	public PromoView parsePromoEntityToPromoView(PromoEntity promoEntity);
	public void savePromo(PromoEntity promoEntity, PromoRepository promoRepository);
	public PromoEntity checkPromo(PromoEntity promoEntity, PromoRepository promoRepository);
	public PromoEntity getPromoByID(long id, PromoRepository promoRepository);
	public PromoEntity getPromoByName(String promoName, PromoRepository promoRepository);

	
	

}
