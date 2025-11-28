package com.book;

public class TestBookManager {

	public static void main(String[] args) {
	 BookManagementImpl s1 = new BookManagementImpl();
     s1.displayAllBooks();
     s1.getBookWithId(1);
     s1.getBooksByAuthor("Oxfrod");
     Book b1 = new Book("science","Oxfrod", 11000);
     s1.searchBook(b1);
	}

}
