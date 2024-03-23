package listpack;
import nodepack.Node;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayList() {
        Node curr = head;
        if (curr == null) {
            System.out.println("No node is present in the linked list");
            return;
        }
        System.out.println("Linked List is:");
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

