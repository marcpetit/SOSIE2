package com.architecture.logicielle.service;

import java.util.List;

import org.codehaus.janino.util.iterator.UniterableElementException;

import com.architecture.logicielle.mvc.data.UniteEnseignementView;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;

public interface UniteEnseignementService {
	
	public UniteEnseignementEntity parseUniteEnseignementViewToUniteEnseignementEntity(UniteEnseignementView ueview);  
	public UniteEnseignementView parseUserEntityToUniteEnseignementView(UniteEnseignementEntity ueentity);
	public void saveUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository);
	public void deleteUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository);
	public UniteEnseignementEntity checkUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository);
	public UniteEnseignementEntity GetUniteEnseignementById(String i, UniteEnseignementRepository ueRepository);
	public List<UniteEnseignementEntity> getListUE(UniteEnseignementRepository ueRepository);
	
	
}
