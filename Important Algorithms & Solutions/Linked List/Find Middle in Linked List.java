/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. 
*/
class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head) {
        // Your code here.
        if (head == null) return -1;
        int n = getLength(head);
        int mid = 1;
        
        while (mid <= n/2) {
            mid++;
            head = head.next;
        }
        
        return head.data;
   }
   
   int getLength(Node head) {
       int len = 0;
       while (head != null) {
           len++;
           head = head.next;
       }
       
       return len;
   }
}