class CountNumberOfSubtreesWithGivenSum {
    public int count = 0;
    
    public int countSubtreesWithSumX(Node root, int x) {
        updateCount(root, x);
        
        return count;
    }
    
    private void updateCount(Node root, int x) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null) {
            if (x - root.data == 0) {
                count++;
                return;
            }
        }
        
        if (sum(root) == x) {
            count++;
        }
    
        updateCount(root.left, x);
        updateCount(root.right, x);
    }
    
    private int sum(Node root) {
        if (root == null) {
            return 0;
        }
        
        return root.data + sum(root.left) + sum(root.right);
    }
}
