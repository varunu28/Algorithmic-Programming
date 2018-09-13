class FindMaxWidthOfTree {
    public int getMaxWidth(Node root) {
        if (root == null) {
            return 0;
        }
        
        int height = getHeight(root);
        int maxWidth = Integer.MIN_VALUE;
        
        for (int i=0; i<height; i++) {
            maxWidth = Math.max(maxWidth, getWidth(root, i));
        }
        
        return maxWidth;
    }		
    
    private int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    private int getWidth(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 0) {
            return 1;
        }
        
        return getWidth(root.left, level-1) + getWidth(root.right, level-1);
    }
}
