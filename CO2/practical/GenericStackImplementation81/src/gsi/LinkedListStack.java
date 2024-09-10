package gsi;
import java.util.EmptyStackException;
public class LinkedListStack<T> implements Stack<T> {
	private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public LinkedListStack() {
        this.top = null;
    }
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
