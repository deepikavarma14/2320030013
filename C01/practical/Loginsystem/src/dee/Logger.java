package dee;

public class Logger {
	 private static Logger loggerInstance;

	    // Private constructor to prevent instantiation from other classes
	    private Logger() {
	        // Private to prevent instantiation
	    }

	    // Public method to provide access to the instance
	    public static synchronized Logger getInstance() {
	        if (loggerInstance == null) {
	            // Create the instance if it doesn't exist
	            loggerInstance = new Logger();
	        }
	        return loggerInstance;
	    }

	    // Method to log messages
	    public void log(String message) {
	        System.out.println("Log message: " + message);
	    }
}
