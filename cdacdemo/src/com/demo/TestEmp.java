package com.demo;

public class TestEmp {

	public static void main(String[] args) {
	// ligle
		Emp e1 = new Emp(1,"aaa");
		Emp e2 = new WageEmp(2, "BB", 10, 1000);
		Emp e3 = new SalesEmp(3,"CCC", 12, 500, 300);
		
		WageEmp we1 = WageEmp( new Emp(11, "suraj",12,1100));

	}

}
