package com.arlo.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.arlo.rest.model.User;


import com.arlo.rest.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	
	//Récupère les données utilisateur
    @GetMapping("/users")
    public List<User> getAllUsers() {
    	return userRepository.findAll();
    }

    // Création d'un utilisateur
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
    	return userRepository.save(user);
    }

    
    // Données d'un seul utilisateur 
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) {
        User user = userRepository.findOne(userId);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }
    
    
 // Modification des données d'un utilisateur
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId, 
                                           @Valid @RequestBody User userDetails) {
        User user = userRepository.findOne(userId);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        user.setUsername(userDetails.getUsername());
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setStatut(userDetails.getStatut());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());

        User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }
    
    // Suppression d'un utilisateur
    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable(value = "id") Long userId) {
        User user = userRepository.findOne(userId);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }

        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }
    
}
