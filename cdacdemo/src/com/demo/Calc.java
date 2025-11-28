package com.demo;

public class Calc {

	
public int add (int a , int b) {
	return a+b ;
}
public float add (float a ,float b) {
	return a+b ;
}
public static void main(String[] args) {
	Calc c = new Calc();
	System.out.println(c.add(10, 20));
	System.out.println(c.add("Tilak", "Shelke"));
	System.out.println(c.add(10.2f,20.4f));
}
	
public String add (String a , String b) {
	return a+b ;
}
}
