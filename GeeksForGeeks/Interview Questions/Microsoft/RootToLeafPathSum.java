class RootToLeafPathSum {
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum) {
        if (node == null || sum == 0) {
            return false;
        }
        
        if (node.left == null && node.right == null) {
            return sum - node.data == 0;
        }
        
        return hasPathSum(node.left, sum-node.data) || hasPathSum(node.right, sum-node.data);
    }
}
