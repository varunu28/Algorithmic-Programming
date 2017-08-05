/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if (position == 0) {
        if (head == null) {
            return head;
        }

        if(head.next == null) {
            head = null;
        }
        
        head = head.next;
        return head;
    }
    
    int count = 0;
    Node current = head;
    while ((count+1) != position && current.next != null) {
        current = current.next;
        count++;
    }
    if (current.next.next != null) {
        current.next = current.next.next;
    }
    else {
        current.next = null;
    }
    return head;
}

