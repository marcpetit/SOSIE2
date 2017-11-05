package com.architecture.logicielle.service;

import com.architecture.logicielle.mvc.data.PromoView;
import com.architecture.logicielle.repository.PromoRepository;
import com.architecture.logicielle.repository.entities.PromoEntity;

public class PromoServiceImpl implements PromoService {

	@Override
	public PromoEntity parsePromoViewToPromoEntity(PromoView promoView) {
		PromoEntity promoEnt = new PromoEntity();
		promoEnt.setYear(promoView.getYear());
		promoEnt.setPromoName(promoView.getPromoName());

		return promoEnt;
	}

	@Override
	public void savePromo(PromoEntity promoEntity, PromoRepository promoRepository) {
		promoRepository.save(promoEntity);
	}

	@Override
	public PromoEntity checkPromo(PromoEntity promoEntity, PromoRepository promoRepository) {
		PromoEntity promoEnt = new PromoEntity();
		promoEnt = promoRepository.findOneByYear(promoEntity.getYear());
		return promoEnt;
	}

	@Override
	public PromoEntity getPromoByID(long id, PromoRepository promoRepository) {
		PromoEntity promoEnt = promoRepository.findOne(id);
		return promoEnt;
	}

	@Override
	public PromoView parsePromoEntityToPromoView(PromoEntity promoEntity) {
		// TODO Auto-generated method stub
		PromoView promoView = new PromoView();
		promoView.setPromoID(promoEntity.getPromoID());
		promoView.setPromoName(promoEntity.getPromoName());
		promoView.setYear(promoEntity.getYear());
		return null;
	}

	@Override
	public PromoEntity getPromoByName(String promoName, PromoRepository promoRepository) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public PromoEntity getPromoByName(String promoName, PromoRepository promoRepository) {
//		return promoRepository.findOneByPromoName(promoName);
//	}

//	@Override
//	public PromoEntity getPromoByName(String promoName, PromoRepository promoRepository) {
//		// TODO Auto-generated method stub
//		return promoRepository.findPromoByName(promoName);
//	}
	

}
