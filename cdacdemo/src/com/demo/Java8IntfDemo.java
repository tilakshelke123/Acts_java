package com.demo;

interface Sayable {
	public void say ();
}

public class Java8IntfDemo { // annonymous method // mostly used in functional interface 
	Sayable s1 = () ->
		System.out.println("lambda");
	
}
