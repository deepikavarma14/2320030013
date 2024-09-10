package queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class GenericPriorityQueue<T extends Comparable<T>> {
	private List<T> elements;

    public GenericPriorityQueue() {
        elements = new ArrayList<>();
    }
    public void enqueue(T element) {
        elements.add(element);
        Collections.sort(elements); 
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return elements.remove(0); 
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return elements.get(0);
    }
}
