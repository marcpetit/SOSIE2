package com.architecture.logicielle.service;

import org.springframework.stereotype.Service;

import com.architecture.logicielle.mvc.data.UserView;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UserEntity;


public class UserServiceImpl implements UserService {

	@Override
	public UserEntity parseUserViewToUserEntity(UserView userview) {

		UserEntity userEnt = new UserEntity();
		userEnt.setFirstName(userview.getFirstName());
		userEnt.setLastName(userview.getLastName());
		userEnt.setUsername(userview.getUsername());
		userEnt.setMail(userview.getMail());
		userEnt.setPassword(userview.getPassword());
		userEnt.setPhoto(userview.getPhoto());
		userEnt.setStatut(userview.getStatut());

		return userEnt;
	}

	@Override
	public void saveUser(UserEntity userEntity, UserRepository userRepository) {
		userRepository.save(userEntity);
	}

	@Override
	public UserEntity checkUser(UserEntity userEntity, UserRepository userRepository) {
		UserEntity user = new UserEntity();
		user = userRepository.findOne(userEntity.getUsername());
		return user;
	}

	@Override
	public UserEntity GetUserById(Long id, UserRepository userRepository) {
		return userRepository.findOne(id);
		
	}

	@Override
	public UserView parseUserEntityToUserView(UserEntity userentity) {

		UserView userview = new UserView();
		userview.setFirstName(userentity.getFirstName());
		userview.setLastName(userentity.getLastName());
		userview.setUsername(userentity.getUsername());
		userview.setMail(userentity.getMail());
		userview.setPassword(userentity.getPassword());
		userview.setPhoto(userentity.getPhoto());
		userview.setStatut(userentity.getStatut());

		return userview;
	}

	@Override
	public void deleteUser(UserEntity userEntity, UserRepository userRepository) {
		userRepository.delete(userEntity);
	}

}
