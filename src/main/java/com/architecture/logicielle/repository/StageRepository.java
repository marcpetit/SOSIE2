package com.architecture.logicielle.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.architecture.logicielle.repository.entities.Stage;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StageRepository extends CrudRepository<Stage, Long> {
	@Query("select s from Stage s "
			+ "left outer join fetch s.eleve e "
			+ "where e.username = ?1 order by s.dateDebut")
	List <Stage> findByUsername(Long username);
	
	@Query("select distinct s from Stage s "
			+ "left outer join fetch s.enseignantReferant e "
			+ "where e.username = ?1 order by s.dateDebut")
	List <Stage> findByEnseignant(Long username);
	
}
