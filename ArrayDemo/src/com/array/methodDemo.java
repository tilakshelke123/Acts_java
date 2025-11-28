package com.array;

public class methodDemo {

	public void greet (){
		System.out.println(" tilak !!!!!");
	}
	public void  greetUser(String uname ) {
		System.out.println("hello" + uname);
	}
	public int add (int a , int b ) {
		return a+b ;
	}
	
	public static void main(String[] args) {
	 methodDemo meth =   new methodDemo();
	 meth.greet(); //  method invocations 
	 meth.greetUser("Tilak");
	 System.out.println(meth.add(20,30));;
	}
	

}
