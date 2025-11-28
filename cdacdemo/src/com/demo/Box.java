
package com.demo;

public class Box {

	int length ;
	int width;
	int height;
	
	public void setDim(int length,int width, int height){
		this.length = length;
		this.width= width;
		this.height= height;
	}
	
	
//	public void displayDim() {
//		System.out.println("length :"+ this.length +" width :"+ this.width + " height :" + this.height);
//	}
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}


	public Box(int length, int width, int height) { //  cobnstructors
	super();
	this.length = length;
	this.width = width;
	this.height = height;
}

	public static void main(String[] args) {
		Box b1 = new Box(1,2,3);
		System.out.println(b1.toString());
		
		Box b2 = new Box(10,20, 30);
		System.out.println(b2.toString());
	}
	
}
