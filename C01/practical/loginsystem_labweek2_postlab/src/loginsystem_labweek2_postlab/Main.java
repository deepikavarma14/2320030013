package loginsystem_labweek2_postlab;

public class Main {
	 public static void main(String[] args) {
	        BankingOperations operations = new BankingOperations();
	        operations.viewBalance();
	        UserSession session = UserSession.getInstance();
	        session.login("JohnDoe");
	        operations.viewBalance();
	        operations.deposit(500);
	        operations.withdraw(200);
	        session.logout();
	        operations.viewBalance();
	    }
}