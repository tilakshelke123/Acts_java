package com.date;

import java.util.Scanner;

public class TestDateClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date ");

		Date date = new Date();

		date.setIntDay(sc.nextInt());
		System.out.println("Enter the month ");
		date.setIntMonth(sc.nextInt());
		System.out.println("Enter the year ");
		date.setIntYear(sc.nextInt());
		date.Display();

	}
	
	//validations 
	
}
