package com.ridesharing;

public class UserAuthentication {
	 private static UserAuthentication instance;

	    private UserAuthentication() {
	        // Private constructor to prevent instantiation
	    }

	    public static UserAuthentication getInstance() {
	        if (instance == null) {
	            instance = new UserAuthentication();
	        }
	        return instance;
	    }

	    public void authenticateUser(String username, String password) {
	        
	        if ("user".equals(username) && "password".equals(password)) {
	            System.out.println("User authenticated successfully.");
	        } else {
	            System.out.println("Authentication failed.");
	        }
	    }
}
