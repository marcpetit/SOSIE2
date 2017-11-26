package com.architecture.logicielle.service;

import java.sql.SQLException;
import java.util.List;
import com.architecture.logicielle.mvc.data.UniteEnseignementView;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;

public interface UniteEnseignementService {
	
	public UniteEnseignementEntity parseUniteEnseignementViewToUniteEnseignementEntity(UniteEnseignementView ueview, UserRepository userRepository);  
	public UniteEnseignementView parseUserEntityToUniteEnseignementView(UniteEnseignementEntity ueentity);
	public void saveUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository, UserRepository userRepository) throws SQLException;
	public void deleteUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository);
	public UniteEnseignementEntity checkUniteEnseignement(UniteEnseignementEntity ueEntity, UniteEnseignementRepository ueRepository);
	public UniteEnseignementEntity GetUniteEnseignementById(String i, UniteEnseignementRepository ueRepository);
	public List<UniteEnseignementEntity> getListUE(UniteEnseignementRepository ueRepository);
	
	
}
