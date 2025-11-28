package com.array;

public class number {

	public static void main(String[] args) {
		int com[] = {20,30,40,50,60};
//	//	System.out.println(a[2]);
//		for (int i : com) {
//			System.out.println(com);
//		}
//
//		
//		 int arr [] =  new int [5];
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			arr[i] = i + 100;
//			
//	}
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}
//	}
	for (int i : com) {
		System.out.println(i);
	}
	char ch [] =  {'a','e','i','o','u'};
	
	for (char c : ch) {
		System.out.println(c);
	}
	//  double dimensionm array 
	int [][]a = {{2,3},{4,3},{5,9,9},{2,1,2,3}};
	
	for (int i = 0 ; i < a.length ; i++) {
		for(int  j = 0 ; j< a[i].length ;j ++) {
			System.out.println(a[i][j]);
		}
	}
	}
}
