class FullBinaryTree {
	boolean isFullTree(Node node) {
	    if (node == null) {
	        return true;
	    }
	    
	    if ((node.left != null && node.right == null) || (node.left == null && node.right != null)) {
	        return false;
	    }
	    
	    return isFullTree(node.left) && isFullTree(node.right);
    }
}
