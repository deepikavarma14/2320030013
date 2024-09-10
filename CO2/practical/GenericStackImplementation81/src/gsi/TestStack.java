package gsi;

public class TestStack {
	 public static void main(String[] args) {
	        Stack<Integer> linkedListStack = new LinkedListStack<>();
	        linkedListStack.push(10);
	        linkedListStack.push(20);
	        linkedListStack.push(30);
	        System.out.println("LinkedListStack (Integer) Peek: " + linkedListStack.peek()); // Output: 30
	        System.out.println("LinkedListStack (Integer) Pop: " + linkedListStack.pop());   // Output: 30
	        System.out.println("LinkedListStack (Integer) Pop: " + linkedListStack.pop());   // Output: 20
	        System.out.println("LinkedListStack (Integer) Is Empty: " + linkedListStack.isEmpty()); // Output: false
	        Stack<String> arrayStack = new ArrayStack<>();
	        arrayStack.push("Hello");
	        arrayStack.push("World");
	        arrayStack.push("!");
	        System.out.println("ArrayStack (String) Peek: " + arrayStack.peek());  // Output: !
	        System.out.println("ArrayStack (String) Pop: " + arrayStack.pop());    // Output: !
	        System.out.println("ArrayStack (String) Pop: " + arrayStack.pop());    // Output: World
	        System.out.println("ArrayStack (String) Is Empty: " + arrayStack.isEmpty()); // Output: false
	    }
}
