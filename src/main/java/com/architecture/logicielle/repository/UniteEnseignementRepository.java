package com.architecture.logicielle.repository;

import org.springframework.data.repository.CrudRepository;

import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UniteEnseignementRepository extends CrudRepository<UniteEnseignementEntity, String> {
	
	
	
}
