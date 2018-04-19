/* Return reference of new head of the reverse linked list 
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */
class gfg {
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverse(Node head) {
       Node curr = head;
       Node next = null;
       Node prev = null;
       
       while (curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       
       return prev;
   }
}
