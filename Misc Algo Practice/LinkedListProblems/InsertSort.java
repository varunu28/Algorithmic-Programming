package LinkedListProblems;

/*Write an InsertSort() function which given a list, rearranges its nodes so they are sorted in increasing
  order.*/

public class InsertSort {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(1);
        linkedList.addNode(32);
        linkedList.addNode(14);
        linkedList.addNode(42);
        linkedList.addNode(93);

        // Before Sorting
        linkedList.printLinkedList(linkedList.head);

        Node newHead = linkedList.insertionSort(linkedList.head);

        // After Sorting
        linkedList.printLinkedList(linkedList.head);
    }

}
