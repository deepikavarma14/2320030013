package log13level;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger loggerChain = LoggerChain.getLoggerChain();

	        System.out.println("Sending INFO level message:");
	        loggerChain.logMessage(LogLevel.INFO, "This is an info message.");

	        System.out.println("\nSending DEBUG level message:");
	        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug message.");

	        System.out.println("\nSending ERROR level message:");
	        loggerChain.logMessage(LogLevel.ERROR, "This is an error message.");
	}

}
