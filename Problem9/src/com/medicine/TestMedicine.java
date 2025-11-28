package com.medicine;

public class TestMedicine {

	public static void main(String[] args) {

		Medicine arrMed[] = new Medicine[5];

		arrMed[0] = new Syrup(100,"12-04-2022");
		arrMed[1] = new Ointment(101,"13-04-2023");
		arrMed[2] = new Tablet(102,"14-04-2025");
		arrMed[3] = new Syrup(103,"15-04-2021");
		arrMed[4] = new Ointment(104,"16-04-2020");

		
		 //loop 
        for (Medicine m : arrMed) {
            m.getDetails(); 
            m.displayLabel();    // polymorphic behavior
            
        }
        System.out.println(" data is displayed  and method is override ");
		
//		Medicine s = new Syrup();  
//		s.displayLabel();
//		
//		Medicine t = new Tablet();
//		t.displayLabel();
//		 
//		Medicine o = new Ointment();
//		o.displayLabel();
		
	}
}