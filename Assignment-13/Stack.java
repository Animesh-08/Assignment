import java.util.Scanner;

interface StackOperations 
{
    void push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}

class MyStack implements StackOperations {
    private int[] stackArray;
    private int top;
    private int capacity;

    MyStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; // Stack is initially empty
    }

   
    public void push(int element) {
        if (!isFull()) {
            top++;
            stackArray[top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack overflow! Cannot push element.");
        }
    }

  
    public int pop() {
        if (!isEmpty()) {
            int poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack underflow! Cannot pop element.");
            return -1;
        }
    }

 
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty! Cannot peek element.");
            return -1;
        }
    }

  
    public boolean isEmpty() {
        return top == -1;
    }

    
    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class Stack
 {
    public static void main(String[] args)
 {
        
        Scanner sc = new Scanner(System.in);
        MyStack myStack = new MyStack(5); 
        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            // For simplicity, let's assume the user enters 1
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    myStack.push(10); // Example element
                    break;
                case 2:
                    int poppedElement = myStack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    int peekedElement = myStack.peek();
                    if (peekedElement != -1) {
                        System.out.println("Top element: " + peekedElement);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
