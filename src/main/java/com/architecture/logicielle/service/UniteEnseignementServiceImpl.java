package com.architecture.logicielle.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.architecture.logicielle.mvc.data.UniteEnseignementView;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;
import com.architecture.logicielle.repository.entities.UserEntity;


public class UniteEnseignementServiceImpl implements UniteEnseignementService {
	
	UserServiceImpl userServices = new UserServiceImpl();

	@Override
	public UniteEnseignementEntity parseUniteEnseignementViewToUniteEnseignementEntity(UniteEnseignementView ueview, UserRepository userRepository) {

		UniteEnseignementEntity ueEnt = new UniteEnseignementEntity();
		
		UserEntity usr = userServices.getUserByNAme(ueview.getFirstname(), ueview.getLastname(), userRepository);
		if(usr != null && usr.getStatut().equals("teacher")) {
		ueEnt.setIdentifiant(ueview.getIdentifiant());
		ueEnt.setNom(ueview.getNom());
		ueEnt.setEnseignantResponsable(usr);
		ueEnt.setDescription(ueview.getDescription());
		return ueEnt;
		}
	
		return null;
	}

	@Override
	public void saveUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository, UserRepository userRepository) throws SQLException{
		
		List<UserEntity> teachers = userServices.getAllTeachers(userRepository);
		for(UserEntity teacher : teachers) {
			
			if(teacher.getFirstName().equals(ueEntity.getEnseignantResponsable().getFirstName()) && teacher.getLastName().equals(ueEntity.getEnseignantResponsable().getLastName())) 
			{
				ueRepository.save(ueEntity);
				break;
			}
		}
		
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
		ueview.setFirstname(ueentity.getEnseignantResponsable().getFirstName());
		ueview.setLastname(ueentity.getEnseignantResponsable().getLastName());
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
