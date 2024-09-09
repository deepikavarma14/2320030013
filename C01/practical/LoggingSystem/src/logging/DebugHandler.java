package logging;

public class DebugHandler extends LogHandler{
	public void handle(String message) {
        if (message.startsWith("DEBUG:")) {
            System.out.println("DEBUG Handler: " + message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
