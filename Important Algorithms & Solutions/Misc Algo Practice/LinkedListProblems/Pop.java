package LinkedListProblems;

/*Write a Pop() function that is the inverse of Push(). Pop() takes a non-empty list, deletes the head node,
 and returns the head node's data*/

public class Pop {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(1);

        System.out.println(linkedList.pop(linkedList.head));
        System.out.println(linkedList.pop(linkedList.head));
        System.out.println(linkedList.pop(linkedList.head));

        // List is empty so now it returns -1
        System.out.println(linkedList.pop(linkedList.head));

    }
}
