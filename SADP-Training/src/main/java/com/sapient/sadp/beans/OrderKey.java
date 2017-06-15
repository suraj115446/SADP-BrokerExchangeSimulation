package com.sapient.sadp.beans;

public final class OrderKey implements Key{
	
	private final long orderId;
	
	public OrderKey(long orderId) {
		super();
		this.orderId = orderId;
	}

	@Override
	public Key getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderKey other = (OrderKey) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}



}
