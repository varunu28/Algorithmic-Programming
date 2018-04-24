/*
  Sort the list of 0's,1's and 2's
  The input list will have at least one element  
  Node is defined as 
  class Node {
 int value;
  Node next;
  Node(int value) {
   this.value = value;
  }
}
*/
class GFG {
    void linksort(Node head) {
        if (head == null) return;
        Map<Integer, Integer> map = new HashMap<>();
        
        Node curr = head;
        
        while (curr != null) {
            map.put(curr.value, map.getOrDefault(curr.value, 0) + 1);
            curr = curr.next;
        }
        
        curr = head;
        while (curr != null) {
            if (map.get(0) > 0) {
                curr.value = 0;
                map.put(0, map.get(0)-1);
            }
            else if (map.get(1) > 0) {
                curr.value = 1;
                map.put(1, map.get(1)-1);
            }
            else {
                curr.value = 2;
            }
            
            curr = curr.next;
        }
    }  
}
