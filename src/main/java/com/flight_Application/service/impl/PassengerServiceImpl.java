package com.flight_Application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_Application.repository.PassengerRepository;
import com.flight_Application.repository.UserRepository;
import com.flight_Application.service.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService{
	 @Autowired
	 private PassengerRepository userRepo;
}
