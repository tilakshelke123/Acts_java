package com.medicine;

import java.util.Date;

public class Syrup extends Medicine {

	
	
	public Syrup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Syrup(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println(" taste of syrup");
	}

	

}
