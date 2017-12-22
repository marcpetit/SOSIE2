package com.arlo.rest.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.arlo.rest.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
