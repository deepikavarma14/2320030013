package services;
import models.Book;
import models.Member;
public interface BorrowingService {
	void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
}
