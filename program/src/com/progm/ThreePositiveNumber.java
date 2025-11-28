package com.progm;


import java.util.Scanner;

public class ThreePositiveNumber {

	public static void main(String[] args) {
		
     int Num1;
     int Num2;
     int Num3;
 
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the fIRST Number:- ");
     Num1 = sc.nextInt();
     System.out.println("Enter the Second Number:- ");
     Num2 =  sc.nextInt();
     System.out.println("Enter the Third Number:- ");
     Num3=  sc.nextInt();
     
     if(Num1 >= Num2 && Num1 >= Num3) {
    	 System.out.println("Num1 is greater "+Num1);
    	 
     }else if(Num2 >= Num3) {
    	 System.out.println("Num2 is greater "+Num2);
     }else {
    	 System.out.println("Num3 is greater "+Num3);
     }
   
     
	}

}
