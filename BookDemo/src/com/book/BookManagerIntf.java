package com.book;

public interface BookManagerIntf {

	
	public void  displayAllBooks() ;
	public Book getBookWithId(int bookId);
	public Book getBooksByAuthor(String author);
	public Boolean searchBook(Book book);
}
