class SumOfRightLeafNodes {
    public int sum = 0;
    public int rightLeafSum(Node root) {
      updateSum(root, false);
      return sum;
   }
   
   public void updateSum(Node node, boolean isRight) {
       if (node == null) {
           return;
       }
       
       if (node.left == null && node.right == null && isRight) {
           sum += node.data;
       }
       
       updateSum(node.left, false);
       updateSum(node.right, true);
   }
}
