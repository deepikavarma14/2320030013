package logging;

public class LogCommand implements Command {
	private LogHandler handler;

    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }
    public void execute(String message) {
        handler.handle(message);
    }
}
