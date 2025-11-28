package com.demo;

import java.util.Scanner;

public class HeloloWorld {

	public static void main(String[] args) {
//		int i ;
//		i = 15 ;
//		System.out.println(i);
//		
//		float sal = 21300.0f;
//		System.out.println(sal);
//		
//		char ch1 = 'a';
//		char ch2 = 'b';
//		System.out.println(ch1 + ch2);
//		long dfs = 10000001 ; 
//		// short s =; 
//		byte b  = 10 ;
//		System.out.println(b);
//		boolean  flag = true ; 
//		System.out.println(flag);
//		
//		
//		float f  = i ; //  implicit type casting / upward type casting 
//		System.out.println(f);
//		
//	//	int j  = f ; //  explicite type cast 
//	int j  = (int)f ; //  explicite type cast 
//	System.out.println(j);
//		
		
		int a  = 15;
		int b = 10 ;
		int c  = 20 ;
//	int 	c = a+b;
//	System.out.println("the sum is " + c);
//		a++;
//		b++;
		
		// a=+b ; aritmatic operatior 
		
		// logical operator 
//		if( a < b) {
//			System.out.println("b is greater ");
//		}
//		else {
//			System.out.println("a is bigger ");
//		}
//		
		//if( a > b && b > c ) {
			
		// }else if () {
			
			Scanner sc  =  new Scanner(System.in);
			System.out.println("Enter your pin :- ");
			String name  = sc.next();
			int  prn   = sc.nextInt();
			System.out.println("hello "+ name  + " your prn :- "+ prn );
			
			for( int i = 0 ; i<= 10 ;i++) {
				System.out.println( i +" " ); 
				
			}
	}

}

