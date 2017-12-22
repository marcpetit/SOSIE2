package com.architecture.logicielle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.architecture.logicielle.repository.entities.UserEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	List<UserEntity> findByStatut(String statut);
}
