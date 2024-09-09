package models;
import java.util.ArrayList;
import java.util.List;
public abstract class Member {
	 protected String name;
	    protected int memberId;
	    protected List<Book> borrowedBooks;

	    public Member(String name, int memberId) {
	        this.name = name;
	        this.memberId = memberId;
	        this.borrowedBooks = new ArrayList<>();
	    }

	    public void borrowBook(Book book) {
	        if (book.isAvailable()) {
	            borrowedBooks.add(book);
	            book.setAvailable(false);
	            System.out.println(name + " borrowed the book: " + book.getTitle());
	        } else {
	            System.out.println("The book is not available for borrowing.");
	        }
	    }

	    public abstract String getMemberType();
}
