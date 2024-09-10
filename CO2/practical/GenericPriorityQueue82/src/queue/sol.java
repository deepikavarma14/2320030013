package queue;

public class sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.enqueue(5);
        intQueue.enqueue(3);
        intQueue.enqueue(8);
        System.out.println("Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.enqueue(5.5);
        doubleQueue.enqueue(3.3);
        doubleQueue.enqueue(8.8);
        System.out.println("Double Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.dequeue());
        }

        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        System.out.println("String Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
	}

}
