package com.flight_Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.flight_Application.service.PassengerService;
@Controller
public class PassengerController {
	@Autowired
	private PassengerService passengerSer;
}
