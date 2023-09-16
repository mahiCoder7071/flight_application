package com.flight_Application.service;

import com.flight_Application.entity.User;
import com.flight_Application.payload.UserDto;

public interface UserService {

	public void saveRegisteration(UserDto user);

	public User findByEmailId(String email);

}
