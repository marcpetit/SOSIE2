package com.architecture.logicielle.service;


import java.util.List;

import com.architecture.logicielle.mvc.data.StageView;
import com.architecture.logicielle.repository.StageRepository;
import com.architecture.logicielle.repository.entities.Stage;

public interface StageService {

	public Stage GetStageByIdStage(Long id, StageRepository stageRepository);
	public void saveStage(Stage stage, StageRepository stageRepository);
	public void deleteStage(Stage stage, StageRepository stageRepository);
	public Stage checkStage(Stage stageEntity, StageRepository stageRepository);
	public Stage parseStageViewToStage(StageView stageView);
	public StageView parseStageToStageView(Stage stage);
	public Boolean checkStageByUser(Long id,StageRepository stageRepository);
	public Stage GetStageByIdUser(Long id, StageRepository stageRepository);
	public Boolean checkStageByEns(Long id, StageRepository stageRepository);
	public Stage GetStageByIdEns(Long id, StageRepository stageRepository);
	public List<Stage> GetListStageByIdEns(Long id, StageRepository stageRepository);

}
