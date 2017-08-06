/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node currentA = headA;
    Node currentB = headB;
    
    boolean flag = true;
    
    while(currentA != null && currentB != null) {
        if (currentA.data != currentB.data) {
            flag = false;
            break;
        }
        currentA = currentA.next;
        currentB = currentB.next;
    }
    
    if (currentA != null || currentB != null) {
        flag = false;
    }
    
    if (flag) {
        return 1;
    }
    else {
        return 0;
    }
}
