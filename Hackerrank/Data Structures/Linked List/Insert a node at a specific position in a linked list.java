/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node tmp = new Node();
    tmp.data = data;
    
    if (position == 0) {
        if (head == null) {
            head = tmp;
            head.next = null;
            return head;
        }
        else {
            tmp.next = head;
            head = tmp;
            return head;
        }
    }
    int count = 0;
    Node current = head;
    while ((count+1) != position && current.next != null) {
        current = current.next;
        count++;
    }
    tmp.next = current.next;
    current.next = tmp;
    return head;
}
