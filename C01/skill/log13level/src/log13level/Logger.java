package log13level;

public abstract class Logger {
	protected LogLevel logLevel;
    protected Logger nextLogger;
    
    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void logMessage(LogLevel level, String message) {
        if (this.logLevel.getLevel() <= level.getLevel()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    protected abstract void write(String message);
}
