package Main;
import models.Book;
import models.RegularMember;
import models.PremiumMember;
import models.Member;
import services.BorrowingService;
import services.BorrowingServiceImpl;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Member member1 = new RegularMember("Alice", 101);
        Member member2 = new PremiumMember("Bob", 102);
        BorrowingService borrowingService = new BorrowingServiceImpl();
        LibraryManagementSystem lms = new LibraryManagementSystem(borrowingService);

        lms.borrowBook(member1, book1); 
        lms.borrowBook(member2, book2); 
        lms.borrowBook(member1, book2); 

        lms.returnBook(member1, book1); 
        lms.returnBook(member2, book2);
                lms.borrowBook(member1, book2);
	}

}
