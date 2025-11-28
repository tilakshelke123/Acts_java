package com.medicine;

import java.util.Date;

public class Tablet extends Medicine{
  
	
	
	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tablet(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println(" store to cool dry place tablet ");
		
	}



}
