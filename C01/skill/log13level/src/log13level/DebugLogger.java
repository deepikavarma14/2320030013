package log13level;

public class DebugLogger {
	public DebugLogger(LogLevel level) {
        super();
    }
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
