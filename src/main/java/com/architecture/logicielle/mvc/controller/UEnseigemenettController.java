package com.architecture.logicielle.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.architecture.logicielle.mvc.data.UniteEnseignementView;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;
import com.architecture.logicielle.service.UniteEnseignementService;
import com.architecture.logicielle.service.UniteEnseignementServiceImpl;
import com.architecture.logicielle.service.UserService;
import com.architecture.logicielle.service.UserServiceImpl;


//@Controller
public class UEnseigemenettController  extends WebMvcConfigurerAdapter {

	
//		@Autowired 
//		private UserRepository userRepository;
//		private UserService userService = new UserServiceImpl();
		
	
		
}
