package source;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource resource = new SharedResource();
        Task task1 = new Task(resource);
        Task task2 = new Task(resource);
        Thread thread1 = new Thread(task1, "Thread 1");
        Thread thread2 = new Thread(task2, "Thread 2");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + resource.getCount());   
	}
}