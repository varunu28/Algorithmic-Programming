class SumOfLeafNodes {
    public int SumofLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        
        if (root.left == null && root.right == null) {
            return root.data;
        }
        
        return SumofLeafNodes(root.left) + SumofLeafNodes(root.right);
    }
}
