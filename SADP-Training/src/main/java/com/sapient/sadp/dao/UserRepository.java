package com.sapient.sadp.dao;

import org.springframework.data.repository.CrudRepository;

import com.sapient.sadp.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	

}
