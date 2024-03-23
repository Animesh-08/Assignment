// Main.java
import java.util.Scanner;
import listpack.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu :");
            System.out.println("1. Add a node to the Linkedlist");
            System.out.println("2. Display the list");
            System.out.println("3. Exit from the menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data for the new node: ");
                    int data = sc.nextInt();
                    list.addNode(data);
                    break;
                case 2:
                    list.displayList();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
       
    }
}

