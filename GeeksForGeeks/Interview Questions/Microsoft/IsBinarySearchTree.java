class IsBinarySearchTree {
    public int isBST(Node root) {
        return isBSTImpl(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    
    private int isBSTImpl(Node root, int max, int min) {
        if (root == null) {
            return 1;
        }
        
        if (root.data < min || root.data > max) {
            return 0;
        }
        
        return Math.min(isBSTImpl(root.left, root.data, min), isBSTImpl(root.right, max, root.data));
    }    
}
