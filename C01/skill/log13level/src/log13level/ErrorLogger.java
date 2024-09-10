package log13level;

public class ErrorLogger extends Logger{
	public ErrorLogger(LogLevel level) {
        super(level);
    }
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
