package com.sapient.sadp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.sadp.entities.User;
import com.sapient.sadp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void addUser(@RequestBody User user){
		userService.addUser(user);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getUserList(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable long id){
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public void updateUser(@RequestBody User user , @PathVariable long id){
		userService.addUser(user);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable long id){
		userService.deleteUser(id);
	}

}
