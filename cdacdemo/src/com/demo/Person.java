package com.demo;

public class Person {

	
		private int pid ;
		private String pname; // instanmce variables 0
		private int age ;
		
		
		
		public Person(int pid, String pname, int age) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.age = age;
		}



	


		@Override
		public String toString() {
			return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
		}



		public static void main(String[] args) {
	        Person p1 =  new Person(1001, "Tilak", 23);
	        Person p2 =  new Person(1002, "Raj", 25);
	        Person p3 =  new Person(1003, "Yash", 27);
	        System.out.println(p1);
	        System.out.println(p2);
	        System.out.println(p3);
	        
	        // objects of arrays 
	        Person [] parr =  {p1,p2,p3};
	        for (Person p :parr) {
	        	System.out.println(p);
	        }
		}

}
