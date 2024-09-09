package services;
import models.Book;
import models.Member;
public class BorrowingServiceImpl implements BorrowingService{
	public void borrowBook(Member member, Book book) {
        member.borrowBook(book);
    }

    public void returnBook(Member member, Book book) {
        if (member.borrowedBooks.contains(book)) {
            member.borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(member.name + " returned the book: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + member.name);
        }
    }
}
