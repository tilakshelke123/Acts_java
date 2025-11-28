package com.medicine;

import java.util.Date;

public class Ointment extends Medicine{

	
	 
	public Ointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ointment(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println("“for external use only ointment ”");
		
	}
	
	

}
