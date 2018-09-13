class MergeSortedLinkedListReverseOrder {
    public Node mergeResult(Node node1, Node node2) {
        Node rev1 = reverse(node1);
        Node rev2 = reverse(node2);
        
        Node head = new Node(-1);
        Node curr = head;
        
        while(rev1 != null || rev2 != null) {
            int val;
            
            if (rev1 != null && rev2 != null) {
                if (rev1.data > rev2.data) {
                    val = rev1.data;
                    rev1 = rev1.next;
                }
                else {
                    val = rev2.data;
                    rev2 = rev2.next;
                }
            }
            else if (rev1 != null) {
                val = rev1.data;
                rev1 = rev1.next;
            }
            else {
                val = rev2.data;
                rev2 = rev2.next;
            }
            
            curr.next = new Node(val);
            curr = curr.next;
        }
        
        return head.next;
    }
    
    private Node reverse(Node node) {
        Node curr = node;
        Node prev = null;
        Node next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
