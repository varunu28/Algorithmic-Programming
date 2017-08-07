/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node currentA = headA;
    Node currentB = headB;
    
    while (currentA != null) {
        currentB = headB;
        while (currentB != null) {
            if (currentB.data == currentA.data) {
                return currentB.data;
            }
            currentB = currentB.next;
        }
        currentA = currentA.next;
    }
    return -1;
}
