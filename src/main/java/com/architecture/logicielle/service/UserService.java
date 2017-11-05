package com.architecture.logicielle.service;

import com.architecture.logicielle.mvc.data.UserView;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UserEntity;


public interface UserService {
	
	public UserEntity parseUserViewToUserEntity(UserView userview);  
	public UserView parseUserEntityToUserView(UserEntity userentity);
	public void saveUser(UserEntity userEntity, UserRepository userRepository);
	public void deleteUser(UserEntity userEntity, UserRepository userRepository);
	public UserEntity checkUser(UserEntity userEntity, UserRepository userRepository);
	public UserEntity GetUserById(Long i, UserRepository userRepository);
	public UserEntity GetUserByEmail(String email, UserRepository userRepository);
}

