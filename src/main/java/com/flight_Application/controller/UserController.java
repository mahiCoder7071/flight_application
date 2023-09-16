package com.flight_Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_Application.entity.User;
import com.flight_Application.payload.UserDto;
import com.flight_Application.service.UserService;
@Controller
public class UserController {
	 @Autowired
	 private UserService userSer;
	 
	 @RequestMapping("/showReg")
	 public String showReg()
	 {
		 return"login/reg";
	 }
	 @RequestMapping("/showLogin")
	 public String login()
	 {
		 return"login/login";
	 }
	 
	 @RequestMapping("/save")
	 public String saveReg(@ModelAttribute("user") UserDto user)
	 {
		 userSer.saveRegisteration(user);
		 return"login/login";
	 }
	 @RequestMapping("/verifyLogin")
	 public String verifyLoginPage(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap model)
	 {
		User user= userSer.findByEmailId(email);
		 if(user!=null) {
			 if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
	         	 return"findFlights";
			 }else {
				 model.addAttribute("error", "Invalid user/password");
				 return "login/login";
			 }
		 }else
		 {
			 model.addAttribute("error", "Invalid user/password");
			 return"login/login";
		 }
	 }
}
