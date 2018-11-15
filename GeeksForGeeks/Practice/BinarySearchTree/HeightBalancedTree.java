class HeightBalancedTree {
    
    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        }
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
