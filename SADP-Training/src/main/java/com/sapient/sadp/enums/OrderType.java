package com.sapient.sadp.enums;

public enum OrderType {
	
	EQUITY(1,"EQ");
	
	private final long orderTypeId;
	private final String orderTypeName;
	
	private OrderType(long orderTypeId, String orderTypeName) {
		this.orderTypeId = orderTypeId;
		this.orderTypeName = orderTypeName;
	}

	public long getOrderTypeId() {
		return orderTypeId;
	}

	public String getOrderTypeName() {
		return orderTypeName;
	}
	

}
