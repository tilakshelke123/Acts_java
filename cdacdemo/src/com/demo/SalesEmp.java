package com.demo;

public class SalesEmp extends WageEmp{
 private int comm;

 
 public SalesEmp(int empId, String empName, int hrs, int rate, int comm) {
	super(empId, empName, hrs, rate);
	this.comm=comm;
 }
 
 // method overriding 
 //
 public int calSal () {
 	return super.calSal()+comm ; //  why used super ? 
 	//--> bcoz we cant direct access of hrs and rate they are private but we know
 	//calsal method return this and add "comm" 
 }

 public static void main(String[] args) {
	SalesEmp se1 = new SalesEmp(1,"Shahrukh", 10, 1000,2000);
	se1.DisplayEmp();
	System.out.println(se1.calSal());
}
	
	
}
