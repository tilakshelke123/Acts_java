package com.demo;

public class Test {

	public static void main(String[] args) {
		
		Box b1 = new Box(6, 7, 8);
		Box b2 = new Box(4, 2, 1);
		Box b3 = new Box(1, 2, 3);
		
		Box boxarr [] = {b1,b2,b3};
		for(Box b: boxarr) {
			System.out.println(b);
		}
	}
}
