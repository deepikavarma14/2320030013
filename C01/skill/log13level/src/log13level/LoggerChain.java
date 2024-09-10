package log13level;

public abstract class LoggerChain{
	public static Logger getLoggerChain() {
		 Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
	        Logger debugLogger = new DebugLogger(LogLevel.DEBUG);
	        Logger infoLogger = new InfoLogger(LogLevel.INFO);

	        // These lines should work if Logger is properly defined
	        infoLogger.setNextLogger(debugLogger);
	        debugLogger.setNextLogger(errorLogger);

	        return infoLogger;
    }
}
