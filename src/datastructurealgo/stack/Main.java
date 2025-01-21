package datastructurealgo.stack;

public class Main {
    private int [] stack;
    private int top;
    private int size;

    // constructor to initialize the stack
    public Main(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push method to add an element
    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = element;
        }
    }

    // Pop method to remove the top element
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; // return -1 for underflow
        }
            return stack[top--];
    }

    // Peek method to view the top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    // Method to check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Main stack = new Main(5);

        // pushing element
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("peek element: " + stack.peek());

        // Popping element
        System.out.println("popped element: " + stack.pop());
        System.out.println("peek element: " + stack.peek());

        // Check if stack is empty
        System.out.println("is stack empty: " + stack.isEmpty());

    }
}
