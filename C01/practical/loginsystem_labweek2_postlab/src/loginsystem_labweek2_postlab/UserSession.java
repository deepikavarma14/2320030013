package loginsystem_labweek2_postlab;

public class UserSession {
	private static UserSession instance;
    private boolean loggedIn;
    private String username;
    private UserSession() {
        loggedIn = false;
        username = null;
    }
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void login(String username) {
        this.username = username;
        loggedIn = true;
        System.out.println(username + " logged in successfully.");
    }

    public void logout() {
        username = null;
        loggedIn = false;
        System.out.println("User logged out successfully.");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername() {
        return username;
    }
}
