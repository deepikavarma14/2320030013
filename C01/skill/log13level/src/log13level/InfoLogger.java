package log13level;

public class InfoLogger extends Logger{
	public InfoLogger(LogLevel level) {
        super(level);
    }
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
