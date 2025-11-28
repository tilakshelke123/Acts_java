package com.cdac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashdemo {

	public static void main(String[] args) {

		// HashSet<Integer> nos = new HashSet<Integer>();
		Set<Integer> nos = new HashSet<Integer>();
		nos.add(10);
		nos.add(30);
		nos.add(20);
		nos.add(50);
		
		Iterator<Integer> s1 = nos.iterator();
	    while(s1.hasNext()) {
	    	System.out.println(s1.next());
	    }
	}
}
