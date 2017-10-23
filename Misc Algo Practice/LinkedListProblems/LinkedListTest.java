package LinkedListProblems;

// A test for LinkedList class

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        System.out.println("Size of linked list is: " + linkedList.getSize(linkedList.head));

        linkedList.printLinkedList(linkedList.head);
    }
}
