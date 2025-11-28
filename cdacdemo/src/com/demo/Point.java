package com.demo;

public class Point extends Shape{

	
	public void draw() {
		System.out.println("Drawing point  !!!");
		
	}
  public static void main(String[] args) {
	// Shape s1 = new Shape() ; can"t be instantiated
	  
	  Point p1 = new Point();
       p1.setColor("Blue");
       System.out.println(p1.getColor());
       p1.draw();
}
	
	}

