package LinkedListProblems;

// Write a Count() function that counts the number of times a given int occurs in a list.

public class Count {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(1);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(4);
        linkedList.addNode(3);

        int num = 4;

        System.out.println(num + " appears " + findCount(linkedList.head, num) + " times in the list");

    }

    public static int findCount(Node head, int num) {

        int c = 0;
        while (head != null) {
            if (head.val == num) {
                c++;
            }
            head = head.next;
        }

        return c;
    }
}
