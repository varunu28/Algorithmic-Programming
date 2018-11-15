class GfG {
    int maxDiff(Node root) {
        int[] ans = {Integer.MIN_VALUE};
        maxDiffHelper(root, ans);
        
        return ans[0];
    }
    
    private int maxDiffHelper(Node node, int[] ans) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        
        int minLeft = maxDiffHelper(node.left, ans);
        int minRight = maxDiffHelper(node.right, ans);

        int diff = Math.max(node.data - minLeft, node.data - minRight);
            
        if(diff > ans[0]){
            ans[0] = diff;
        }
        
        return Math.min(node.data, Math.min(minLeft, minRight));
    }
}
