package com.demo;

public abstract class Shape {
// 
	String color;

   //concrete methods 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void draw() ;
		// no body bcoz its abstract
	
}
