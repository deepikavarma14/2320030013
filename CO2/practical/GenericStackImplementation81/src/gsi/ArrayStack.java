package gsi;
import java.util.EmptyStackException;
public class ArrayStack<T> implements Stack<T> {
	private T[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }
    public void push(T item) {
        if (top == stack.length - 1) {
            resize(2 * stack.length);
        }
        stack[++top] = item;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = stack[top];
        stack[top--] = null;
        if (top > 0 && top == stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }

    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] temp = (T[]) new Object[newCapacity];
        for (int i = 0; i < top + 1; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }
}
