class SwapAdjacentNodesBySwappingData {
    public static void pairwiseSwap(Node node) {
        Node curr = node;
        while(curr != null && curr.next != null) {
            int temp = curr.next.data;
            curr.next.data = curr.data;
            curr.data = temp;

            curr = curr.next.next;
        }
    }
   
}
