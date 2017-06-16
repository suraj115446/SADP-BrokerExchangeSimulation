package com.sapient.sadp.enums;

public enum ValidationResult {
	
	AUTHORISED("Authorised");
	
	private String resultName;

	private ValidationResult(String resultName) {
		this.resultName = resultName;
	}

	public String getResultName() {
		return resultName;
	}

	
}
