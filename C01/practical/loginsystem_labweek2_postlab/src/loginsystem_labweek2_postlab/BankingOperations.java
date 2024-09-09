package loginsystem_labweek2_postlab;

public class BankingOperations {
	public void viewBalance() {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Balance for " + session.getUsername() + ": $1000");
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Deposited $" + amount + " to " + session.getUsername() + "'s account.");
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Withdrew $" + amount + " from " + session.getUsername() + "'s account.");
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
