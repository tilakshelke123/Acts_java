package com.book;

import java.util.Scanner;

import com.book.*;

public class TestBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Book b1 = new Book(1, "Tilak", "oxford", 1100);
//		Book b2 = new Book(2, "piyush", "oxford1", 1200);
//		Book b3 = new Book(3, "piyush1", "oxford2", 1300);
//		Book b4 = new Book(4, "vishu", "oxford3", 1400);
//		Book b5 = new Book(5, "vivek", "oxford4", 1500);

//		Book bookarr[] = { b1, b2, b3, b4, b5 };
//		for (Book b : bookarr) {
//			System.out.println(b);
//		}

		Book bookarr[] = new Book[5];
	int count =0;
		
		System.out.println("Enter the book details  to add thye books ");
		for( int i =0 ; i < bookarr.length ; i++) {
			// conditions 
			// to allow and  stopthr 
			System.out.println("Enter 0 for stop & 1 for add");
			if(sc.nextInt()==0) {
				break;
			}
			
			System.out.println("eneter book name , author , price ");
	        Book b = new Book(sc.next(),sc.next(),sc.nextFloat());
	        bookarr[i]=b;
	        count++;
		}
		
//		for(Book b : bookarr) {
//			System.out.println(b);
//		}
		
		
		// to remove " null " 
		for(int i=0; i<count; i++) {
			System.out.println(bookarr[i]);
		}
		
		
		// taking the input from the user ;
		System.out.println("please  enter the BookId; -");
		int bookId = sc.nextInt();

		// checking condition
        //1> Book id preseent or not 
		for (Book b : bookarr) {
			if (b.getBookNo() == bookId) {
				System.out.println(b);
				break;
			} else {
				System.out.println(" Entered Book id is not valid please Entered Right bOOK iD !");
			}
		}
   
				
		// 2> Condition 
		// increase price by 5 % for all bokks 
		
        System.out.println("\nIncrementing prices by 5% and displaying updated details:");
        for (Book book : bookarr) {
            book.incrPrice(5); // Increment price by 5%
            book.displayBookDetails();
        }

    
//		for(Book b :bookarr) {
//			Book incrPrice = b.incrPrice(1.05, b);
//			System.out.println(incrPrice);
//		}
	}
}
