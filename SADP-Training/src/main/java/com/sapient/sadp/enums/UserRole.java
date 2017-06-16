package com.sapient.sadp.enums;

public enum UserRole {
	
	ADMIN(1,"admin"),
	TRADER(2,"trader"),
	PM(3,"PORTFOLIOMANAGER");
	
	private final long id;
	private final String name;
	
	private UserRole(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	

}
