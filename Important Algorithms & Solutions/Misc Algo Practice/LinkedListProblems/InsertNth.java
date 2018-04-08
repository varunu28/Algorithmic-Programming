package LinkedListProblems;

//Write a function InsertNth() which can insert a new node at any index within a list. Index- 0 based

public class InsertNth {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(1);

        // Before Insertion
        linkedList.printLinkedList(linkedList.head);

        linkedList.insertNth(linkedList.head, 1, 4);

        // After Insertion
        linkedList.printLinkedList(linkedList.head);
    }
}
