package com.demo;

public class DemoTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("in try block ");
			String s= "hello";
			System.out.println(s.length());
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException !!!!");
		}
		finally {
			System.out.println("finaly work");
		}
		}

}
