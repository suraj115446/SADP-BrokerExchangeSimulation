package com.sapient.sadp.service.impl;

import com.sapient.sadp.enums.ValidationResult;
import com.sapient.sadp.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public ValidationResult validate(String userName, String password) {
		// TODO Auto-generated method stub
		
		return ValidationResult.AUTHORISED;
	}

}
