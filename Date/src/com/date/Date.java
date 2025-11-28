package com.date;

public class Date {
	
	int intDay;
	int intMonth;
	int intYear;
	
	
	public Date(int intDay, int intMonth, int intYear) {
		super();
		this.intDay = intDay;
		this.intMonth = intMonth;
		this.intYear = intYear;
	}





	public Date() {
		// TODO Auto-generated constructor stub
	}





	public int getIntDay() {
		return intDay;
	}


	public void setIntDay(int intDay) {
		this.intDay = intDay;
	}


	public int getIntMonth() {
		return intMonth;
	}


	public void setIntMonth(int intMonth) {
		this.intMonth = intMonth;
	}


	public int getIntYear() {
		return intYear;
	}


	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
   
	 // validation

	public void Display() {
		System.out.println("day"+ intDay);
		System.out.println("month"+intMonth);
		System.out.println("year"+intYear);
	}


	
	

}
