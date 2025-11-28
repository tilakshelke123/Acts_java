package com.demo;

public class Emp {

	
	private int empId;
    private String empName;
    
    
    
    public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}



	public void DisplayEmp() {
		System.out.println( "Emp [empId=" + empId + ", empName=" + empName + "]");
	}
    
    
}
