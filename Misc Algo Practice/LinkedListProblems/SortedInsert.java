package LinkedListProblems;

/*Write a SortedInsert() function which given a list that is sorted in increasing order, and a single node,
  inserts the node into the correct sorted position in the list.*/

public class SortedInsert {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(6);
        linkedList.addNode(8);
        linkedList.addNode(32);

        // Before Insertion
        linkedList.printLinkedList(linkedList.head);

        int valToInsert = 15;
        linkedList.sortedInsert(linkedList.head, valToInsert);

        // After Insertion
        linkedList.printLinkedList(linkedList.head);
    }

}
