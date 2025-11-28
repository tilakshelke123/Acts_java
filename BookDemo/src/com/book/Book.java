package com.book;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private float price ;
	
	// initialised
	private static int bookCount;
	
	// static block 
	static {
		bookCount = 0;
	}
	
	
	
	// 3b // 2>
	//getter
	public static int getBookCount() {
		return bookCount;
	}


	


	public Book( String title, String author, float price) {
		super();
		this.bookNo = bookCount++;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}

		

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
  
	 public void incrPrice(double percentage) {
	        this.price += this.price * (percentage / 100);
	    }
	 
	 public void displayBookDetails() {
	        System.out.println("Book Number: " + bookNo);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.printf("Price: %.2f%n", price);
	    }
	

//	public static void main(String[] args) {
//		
//		Book bk = new Book(1001, "Java", "Oxford", 1200);
//		bk.incrPrice(1100);
//		System.out.println(bk);
//	}
	
	

}
