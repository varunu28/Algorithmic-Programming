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

    public void insertNth(Node head, int pos, int val) {
        int size = getSize(head) - 1;

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(val);

        if (pos == 0) {
            newNode.next = head;
            this.head = newNode;
        }
        else {
            int count = 1;
            while (count < pos) {
                head = head.next;
                count++;
            }

            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public int pop(Node head) {
        if (head == null) {
            return -1;
        }
        else {
            int val = head.val;
            this.head = this.head.next;
            return val;
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
