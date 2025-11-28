package com.demo;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = new String("hello");
		String s3= "hello";
		String s4 =s1;
		System.out.println(s1 == s2); // diff location store 
		System.out.println(s1 ==s3); // same location store bcoz they didnt use new 
	
		// Strings are immutable
		 s1 +=  "Everbody";
		 System.out.println(s2);
		 
		 String str = new String("hello world");
		 String str1 = new String("hello world");
		System.out.println(str.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(" all"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("orl"));
		
		System.out.println(s1 == s2);
		System.out.println(str.equals(str1)); // same content check bcoz of equal method 
		
		System.out.println(s1.startsWith("w"));
		 String s99 = "piyush$tilak$honey ";
		 String [] arr = s99.split("$");
		 for(String str2 : arr) {
			 System.out.println(str2);
		 }
	}
}
