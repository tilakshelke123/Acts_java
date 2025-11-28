package com.cdac.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// LinkedList list = new LinkedList();
		List list = new LinkedList();
		
		list.add(1);
		list.add(22);
		list.add(12);
		
		list.add(15);
		list.add(19);
		System.out.println(list);
		int i = (int) list.get(0); // first value 
		System.out.println(i);
		
		List<Integer>  list1= new LinkedList<>();
		list1.add(1);
		list1.add(22);
	//	list1.add("Tilak"); // why bcoz  strings 
		list1.add(12);
		System.out.println(list1);
		
		
	//  for each  loop 
		for(int b : list1) {
			System.out.println(b);
		}
		
		List<String> str= new LinkedList<String>();
		str.add("Piyush");
		str.add("Piyush1");
		str.add("Piyush2");
		str.add("Piyush");
		
		Iterator<String> str1 = str.iterator(); // old techinque to iterate
		while (str1.hasNext()) {
			System.out.println(str1.next());
			System.out.println(" done");;
		}
		
		// next();
		//hasnext()
		//remove();
		 
		/*
		 * for(String c : str) { System.out.println(c); }
		 */
		
	}

}
