package Main;
import services.BorrowingService;
import models.Book;
import models.Member;
public class LibraryManagementSystem {
	private BorrowingService borrowingService;
    public LibraryManagementSystem(BorrowingService borrowingService) {
        this.borrowingService = borrowingService;
    }

    public void borrowBook(Member member, Book book) {
        borrowingService.borrowBook(member, book);
    }

    public void returnBook(Member member, Book book) {
        borrowingService.returnBook(member, book);
    }
}
