package com.sapient.sadp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.sadp.entities.User;


@Service
public interface UserService {

	void addUser(User user);

	List<User> getAllUsers();

	User getUser(long id);

	void deleteUser(long id);

}
