/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if (head == null) {
        return false;
    }    
    Node first = head;
    Node sec = head;
    
    while (sec != null && sec.next != null) {
        first = first.next;
        sec = sec.next.next;
        
        if (first == sec) {
            return true;
        }
    }
    return false;
}
