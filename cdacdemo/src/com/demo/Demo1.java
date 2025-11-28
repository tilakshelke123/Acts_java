package com.demo;

interface Greeter {
	public void greet();
}

/*
 * class GreeterImpl implements Greeter {
 * 
 * @Override public void greet() { System.out.println("greet impl");
 * 
 * }
 * 
 * }
 */

public class Demo1 {

	public static void main(String[] args) {

		/* Greeter g = new GreeterImpl(); */
		/* g.greet(); */
		Greeter g1 = new Greeter() { // annonymous class 
			
			@Override
			public void greet() {
				System.out.println("annonymous class ");
				
			}
			
		};
		g1.greet();
		
	}


}
