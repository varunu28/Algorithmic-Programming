class SumOfBinaryTree {
    public int sumBT(Node root){
        if (root == null) {
            return 0;
        }
        
        return root.data + sumBT(root.left) + sumBT(root.right);
   }
}
