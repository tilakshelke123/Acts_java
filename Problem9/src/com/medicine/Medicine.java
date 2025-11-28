package com.medicine;

import java.util.Date;

public abstract class Medicine {
	private int price;
	private String expiryDate;

	public Medicine(int price, String expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDetails() {
		return "Medicine [price=" + price + ", expiryDate=" + expiryDate + "]";
	}

	

	public Medicine() {
		super();
		//default const.
	}

	public abstract void displayLabel(); 
	
}
