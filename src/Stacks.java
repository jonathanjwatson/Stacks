import java.util.*;

public class Stacks {
	public static void main(String[] args) {
		Stack<Integer> myStack;
		// creates a reference variable for a Stack called myStack
		myStack = new Stack<Integer>();
		// creates a new Integer Stack and assigns its address to myStack

		myStack.push(1);
		// Pushes 1 to the top of our stack
		// myStack now consists of [1]
		myStack.push(2);
		// myStack now consists of [1, 2]
		myStack.push(3);
		// myStack now consists of [1, 2, 3]
		System.out.println(myStack);

		Integer removedNumber = myStack.pop();

		System.out.println(myStack);
		System.out.printf("You removed: %d\n", removedNumber);

		System.out.println(myStack.peek());
		System.out.println(myStack);

		System.out.println(myStack.empty());

	}
}
