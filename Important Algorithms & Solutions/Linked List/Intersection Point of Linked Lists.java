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
This is method only submission.  You only need to complete the method. */

class GFG {
	int intersectPoint(Node headA, Node headB) {
	    int lenA = getLength(headA);
	    int lenB = getLength(headB);
	    
	    Node big;
	    Node small;
	    
	    int diff = lenA - lenB;
	    
	    if (diff > 0) {
	        big = headA;
	        small = headB;
	    }
	    else {
	        big = headB;
	        small = headA;
	        diff *= -1;
	    }
	    
	    while (diff-- > 0) {
	        big = big.next;
	    }
	     
	    while (big != null) {
	        if (big.data == small.data) {
	            return big.data;
	        }
	        big = big.next;
	        small = small.next;
	    }
	    
	    return -1;
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
