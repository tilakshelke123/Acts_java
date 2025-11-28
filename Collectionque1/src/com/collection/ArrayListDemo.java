package com.collection;

public class ArrayListDemo {

	public static void main(String[] args) {
		StudentOps o1 = new StudentOps();
		o1.setNames();
		o1.setNames("Tilak");
		o1.searchName(0);
		o1.searchName("Tilak");
		o1.printNames();
		o1.removeName("Tilak");

	}

}
