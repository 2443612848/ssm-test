package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.User;
import com.test.service.impl.UserSerivceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserSerivceImpl userService;
	
	@Autowired
	public void setUserService(UserSerivceImpl userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/login")
	public String login(String username,String password) {
		User user = userService.login(username, password);
		if(user != null) {
			return "success";
		}
		return "error";
	}
}
