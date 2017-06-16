package com.sapient.sadp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.sadp.enums.ValidationResult;
import com.sapient.sadp.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/validateLogin", method=RequestMethod.POST)
	public ValidationResult addUser(@RequestBody String userName
			,@RequestBody String password){
		return loginService.validate(userName,password);
	}

}
