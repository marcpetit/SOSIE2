package com.architecture.logicielle.service;

import com.architecture.logicielle.mvc.data.UserView;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UserEntity;

public class UserServiceImpl implements UserService {

	@Override
	public UserEntity parseUserViewToUserEntity(UserView userview) {

		UserEntity userEnt = new UserEntity();
		userEnt.setEmail(userview.getEmail());
		userEnt.setPassword(userview.getPassword());
		userEnt.setRole(userview.getRole());
		//userEnt.setPromoID(userview.getPromoID());

		return userEnt;
	}

	@Override
	public void saveUser(UserEntity userEntity, UserRepository userRepository) {
		userRepository.save(userEntity);
	}

	@Override
	public UserEntity checkUser(UserEntity userEntity, UserRepository userRepository) {
		UserEntity user = new UserEntity();
		user = userRepository.findOne(userEntity.getPUID());
		return user;
	}

	@Override
	public UserEntity GetUserById(Long id, UserRepository userRepository) {
		return userRepository.findOne(id);
		
	}
	
	@Override
	public UserEntity GetUserByEmail(String email, UserRepository userRepository) {
		return userRepository.findOneByEmail(email);
	}

	@Override
	public UserView parseUserEntityToUserView(UserEntity userEntity) {

		UserView userView = new UserView();
		userView.setPUID(userEntity.getPUID());
		userView.setEmail(userEntity.getEmail());
		userView.setPassword(userEntity.getPassword());
		userView.setRole(userEntity.getRole());

		return userView;
	}

	@Override
	public void deleteUser(UserEntity userEntity, UserRepository userRepository) {
		userRepository.delete(userEntity);
	}

}
