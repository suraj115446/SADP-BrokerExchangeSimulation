package com.sapient.sadp.service;

import com.sapient.sadp.enums.ValidationResult;

public interface LoginService {

	ValidationResult validate(String userName, String password);

}
