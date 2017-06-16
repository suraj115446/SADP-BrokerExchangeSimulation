package com.sapient.sadp.enums;

public enum Side {

	BUY("Buy"),
	SELL("Sell");
	
	private final String name;

	private Side(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
