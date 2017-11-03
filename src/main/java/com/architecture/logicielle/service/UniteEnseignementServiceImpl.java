package com.architecture.logicielle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.architecture.logicielle.mvc.data.UniteEnseignementView;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;


public class UniteEnseignementServiceImpl implements UniteEnseignementService {

	@Override
	public UniteEnseignementEntity parseUniteEnseignementViewToUniteEnseignementEntity(UniteEnseignementView ueview) {

		UniteEnseignementEntity ueEnt = new UniteEnseignementEntity();
		ueEnt.setIdentifiant(ueview.getIdentifiant());
		ueEnt.setNom(ueview.getNom());
		ueEnt.setEnseignantResponsable(ueview.getEnseignantResponsable());
		ueEnt.setDescription(ueview.getDescription());
		
		return ueEnt;
	}

	@Override
	public void saveUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository) {
		ueRepository.save(ueEntity);
	}

	@Override
	public UniteEnseignementEntity checkUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository) {
		UniteEnseignementEntity ue = new UniteEnseignementEntity();
		ue = ueRepository.findOne(ueEntity.getIdentifiant());
		return ue;
	}

	@Override
	public UniteEnseignementEntity GetUniteEnseignementById(String id, UniteEnseignementRepository ueRepository) {
		return ueRepository.findOne(id);
		
	}

	@Override
	public UniteEnseignementView parseUserEntityToUniteEnseignementView(UniteEnseignementEntity ueentity) {

		UniteEnseignementView ueview = new UniteEnseignementView();
		ueview.setIdentifiant(ueentity.getIdentifiant());
		ueview.setNom(ueentity.getNom());
		ueview.setEnseignantResponsable(ueentity.getEnseignantResponsable());
		ueview.setDescription(ueentity.getDescription());

		return ueview;
	}

	
	@Override
	public void deleteUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository) {
		ueRepository.delete(ueEntity);
	}

	@Override
	public List<UniteEnseignementEntity> getListUE(UniteEnseignementRepository ueRepository) {
		
		List<UniteEnseignementEntity> listUe = new ArrayList<>();
		for(UniteEnseignementEntity ue1: ueRepository.findAll()) {
			listUe.add(ue1);
		}
		return listUe;
	}

}
