/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if (head != null) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node current = head;
        while (true) {
            arr.add(current.data);
            current = current.next;
            if (current == null) {
                break;
            }
        }
        
        for (int i=arr.size()-1;i>=0;i--) {
            System.out.println(arr.get(i));
        }
    }
 
}
