package com.demo;

public class WageEmp extends Emp{

	
	private int hrs , rate;
	
	public WageEmp(int empId, String empName ,int hrs ,int rate) {
		super(empId, empName);
		this.hrs=hrs;
		this.rate=rate;
	}
    public int calSal () {
    	return hrs *rate;
    }
	
	public static void main(String[] args) {
		WageEmp we1 = new WageEmp(1001, "Tilak", 10, 10);
		
		we1.DisplayEmp();
		System.out.println(we1.calSal());
	}
	
}
