package com.architecture.logicielle.repository;

import org.springframework.data.repository.CrudRepository;
import com.architecture.logicielle.repository.entities.PromoEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PromoRepository extends CrudRepository<PromoEntity, Long> {
	PromoEntity findOneByYear(int year);
	
}
