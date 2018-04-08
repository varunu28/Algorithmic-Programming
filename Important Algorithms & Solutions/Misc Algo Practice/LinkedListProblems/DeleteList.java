package LinkedListProblems;

/*Write a function DeleteList() that takes a list, deallocates all of its memory and sets its head pointer
 to NULL (the empty list).*/

public class DeleteList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(8);
        linkedList.addNode(32);
        linkedList.addNode(4);
        linkedList.addNode(24);
        linkedList.addNode(13);

        // Printing after deleting linked list
        linkedList.printLinkedList(delete(linkedList.head));
    }

    public static Node delete(Node head) {

        while (head.next != null) {
            Node temp = head.next;
            head = null;
            head = temp;
        }

        return null;
    }
}
