package com.progm;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int Num1;
		 
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the fIRST Number:- ");
	     Num1 = sc.nextInt();
	     for(int i=1 ;i <=10 ;i++) {
	    	 System.out.println(i*Num1);
	     }

	}

}
