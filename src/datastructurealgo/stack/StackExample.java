package datastructurealgo.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Displaying the stack
        System.out.println("Top element of the stack is: " + stack.peek());

        // Popping the element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after Pop: " + stack.peek());

        // Checking if stack is empty
        System.out.println("Is stack empty: " + stack.empty());
    }
}
