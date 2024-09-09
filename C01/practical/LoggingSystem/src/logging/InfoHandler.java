package logging;

public class InfoHandler extends LogHandler{
	public void handle(String message) {
        if (message.startsWith("INFO:")) {
            System.out.println("INFO Handler: " + message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
