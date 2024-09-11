package source;

public class Task implements Runnable{
	private SharedResource resource;

    public Task(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
