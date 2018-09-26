class SumOfLeftLeafNodes {
    public int sum = 0;
    public int leftLeafSum(Node root) {
      updateSum(root, false);
      return sum;
    }
    
    public void updateSum(Node node, boolean isLeft) {
       if (node == null) {
           return;
       }
       
       if (node.left == null && node.right == null && isLeft) {
           sum += node.data;
       }
       
       updateSum(node.left, true);
       updateSum(node.right, false);
   }
}
