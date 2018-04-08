package LinkedListProblems;

/*Write an Append() function that takes two lists, 'a' and 'b', appends 'b' onto the end of 'a', and
  then sets 'b' to NULL (since it is now trailing off the end of 'a').*/

public class Append {

    public static void main(String[] args) {

        LinkedList a = new LinkedList();
        a.addNode(1);
        a.addNode(2);

        LinkedList b = new LinkedList();
        b.addNode(3);
        b.addNode(4);

        Node ans = append(a.head, b.head);

        a.printLinkedList(ans);
        b.head = null;
        b.printLinkedList(b.head);

    }

    public static Node append(Node headA, Node headB) {

        Node currA = headA;
        Node currB = headB;

        while (currA.next != null) {
            currA = currA.next;
        }
        currA.next = currB;

        return headA;
    }
}
