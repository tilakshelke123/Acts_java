package com.cdac.collection;

import java.util.Date;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(10, 5);
		System.out.println(v.size()); // 0
		System.out.println(v.capacity()); // 10

		v.add("aaa");
		v.add(10);
		v.add(12.3f);
		v.add(new Date());

		System.out.println(v.size()); // 4 // above 4 storer
		System.out.println(v.capacity()); // 10

		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);

		System.out.println(v.size()); // 12 .// above 4 + above 8 store i.e 12
		System.out.println(v.capacity()); // 20 // double the memory the when filled capacity
		v.trimToSize(); // reduce the size
		System.out.println(v.size()); // 12
		System.out.println(v.capacity()); // 12
	}

}
