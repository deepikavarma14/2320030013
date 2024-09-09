package logging;

public class ErrorHandler extends LogHandler{
	public void handle(String message) {
        if (message.startsWith("ERROR:")) {
            System.out.println("ERROR Handler: " + message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
