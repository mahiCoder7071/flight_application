package com.flight_Application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_Application.entity.User;
import com.flight_Application.payload.UserDto;
import com.flight_Application.repository.UserRepository;
import com.flight_Application.service.UserService;
@Service
public class UserServiceImpl implements UserService{
      @Autowired
	 private UserRepository userRepo;

	@Override
	public void saveRegisteration(UserDto user) {
		User userEntity=new User();
		userEntity.setId(user.getId());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userRepo.save(userEntity);
	}

	@Override
	public User findByEmailId(String email) {
		User findByEmail = userRepo.findByEmail(email);
		return findByEmail;
	}
}
