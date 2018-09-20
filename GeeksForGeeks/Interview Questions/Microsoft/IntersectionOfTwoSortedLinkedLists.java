class IntersectionOfTwoSortedLinkedLists {
    
    public Node getIntersection(Node head1, Node head2) {
        Node ans = new Node(-1);
        Node curr = ans;
        
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                curr.next = new Node(head1.data);
                curr = curr.next;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if (head1.data > head2.data) {
                head2 = head2.next;
            }
            else {
                head1 = head1.next;
            }
        }
        
        return ans.next;
    }
}
