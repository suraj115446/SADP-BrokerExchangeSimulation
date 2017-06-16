package com.sapient.sadp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.sadp.dao.UserRepository;
import com.sapient.sadp.entities.User;
import com.sapient.sadp.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public User getUser(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public void deleteUser(long id) {
		userRepository.delete(id);
	}
	
	

}
