package com.architecture.logicielle.service;

import java.util.List;

import com.architecture.logicielle.mvc.data.StageView;
import com.architecture.logicielle.repository.StageRepository;
import com.architecture.logicielle.repository.entities.Stage;
import com.architecture.logicielle.repository.entities.UserEntity;

public class StageServiceImpl implements StageService {

	@Override
	public Stage GetStageByIdUser(Long id, StageRepository stageRepository) {
		List<Stage> stages = stageRepository.findByUsername(id);
		if (stages.size()>0)
			return stages.get(0);
		else
			return null;
	}
	
	@Override
	public Stage GetStageByIdEns(Long id, StageRepository stageRepository) {
		List<Stage> stages = stageRepository.findByEnseignant(id);
		if (stages.size()>0)
			return stages.get(0);
		else
			return null;
	}
	
	@Override
	public List<Stage> GetListStageByIdEns(Long id, StageRepository stageRepository) {
		List<Stage> stages = stageRepository.findByEnseignant(id);
		if (stages.size()>0)
			return stages;
		else
			return null;
	}
	

	@Override
	public Stage parseStageViewToStage(StageView stageView) {
	
		Stage stage = new Stage();
		stage.setIdStage(stageView.getIdStage());
		stage.setDateDebut(stageView.getDateDebut());
		stage.setDateFin(stageView.getDateFin());
		stage.setNomEntreprise(stageView.getNomEntreprise());
		stage.setSujet(stageView.getSujet());
	
		return stage;
	}

	@Override
	public StageView parseStageToStageView(Stage stage) {
		
		StageView stageView = new StageView();
		stageView.setDateDebut(stage.getDateDebut());
		stageView.setDateFin(stage.getDateFin());
		stageView.setIdStage(stage.getIdStage());
		stageView.setNomEntreprise(stage.getNomEntreprise());
		stageView.setSujet(stage.getSujet());
		UserEntity ens = stage.getEnseignantReferant();
		stageView.setUsernameEnseignantReferant(ens.getUsername());
		UserEntity eleve = stage.getEleve();
		stageView.setUsernameEleve(eleve.getUsername());
		
		return stageView;
	}

	@Override
	public Stage GetStageByIdStage(Long id, StageRepository stageRepository) {
		return stageRepository.findOne(id);
	}
	

	@Override
	public void saveStage(Stage stage, StageRepository stageRepository) {
		stageRepository.save(stage);
		
	}

	@Override
	public void deleteStage(Stage stage, StageRepository stageRepository) {
		stageRepository.delete(stage);
		
	}

	@Override
	public Stage checkStage(Stage stageEntity, StageRepository stageRepository) {
		Stage stage = new Stage();
		stage = stageRepository.findOne(stage.getIdStage());
		return stage;
	}

	@Override
	public Boolean checkStageByUser(Long id, StageRepository stageRepository) {
		Stage stage = GetStageByIdUser(id, stageRepository);
		if(stage != null) {
			return true;
		}
		else {
			return false;
		}
	}
		
		@Override
		public Boolean checkStageByEns(Long id, StageRepository stageRepository) {
			Stage stage = GetStageByIdEns(id, stageRepository);
			if(stage != null) {
				return true;
			}
			else {
				return false;
			}

	}	
	
}
