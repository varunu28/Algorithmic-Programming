package LinkedListProblems;

// Basic Utility class for linked list

public class LinkedList {
    Node head = null;

    public void addNode(int x) {

        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

    }

    public int getSize(Node head) {

        int size = 0;

        while (head != null) {
            head = head.next;
            size++;
        }

        return size;

    }

    public Node buildOneTwoThree() {

        Node head = new Node(1);
        Node curr = head;
        int i = 2;

        while (i <= 3) {
            Node newNode = new Node(i);
            curr.next = newNode;
            curr = curr.next;
            i++;
        }

        return head;
    }

    public void printLinkedList(Node head) {

        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }

        System.out.println("null");
    }
}

class Node {

    public int val;
    public Node next;

    public Node(int x) {
        this.val = x;
        this.next = null;
    }

}