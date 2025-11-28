package com.book;
public class BookManagementImpl extends Book implements BookManagerIntf{

	
	private Book[] booklist;
	
	
	
	public BookManagementImpl() {
		booklist = new Book [] {
				new Book("science","Oxfrod", 11000),
				new Book("history","standford", 12000),
				new Book("marathi","california", 13000),
				new Book("politics"," pennysilviya",14000)
		};
	}
	 
	

	@Override
	public void displayAllBooks() {
		
		for(Book book :booklist ) {
			System.out.println(book);
		}
		System.out.println(" display all the books !!");
		
	}

	@Override
	public Book getBookWithId(int bookId) {
		for(Book book : booklist) {
		if(bookId == book.getBookNo()){
			System.out.println(book);
			return book;
		}
		
	}
		return null;
	}
	@Override
	public Book getBooksByAuthor(String author) {
		for(Book book :booklist) {
			if(author == book.getAuthor()) {
				System.out.println(book);
			return book;
			}
			
		}
		return null;
	}

	@Override
	public Boolean searchBook(Book book) {
		for (Book book1 : booklist) {
			if(book.equals(book1)) {
				System.out.println(" yes book found !!!");
			}
		}
		return false;
	}

}
