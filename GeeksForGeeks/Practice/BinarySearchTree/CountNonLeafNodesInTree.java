class CountNonLeafNodesInTree {
	int countNonLeafNodes(Node node) {
	    if (node == null) {
	        return 0;
	    }
	    
	    if (node.left == null && node.right == null) {
	        return 0;
	    }
	    
	    return 1 + countNonLeafNodes(node.left) + countNonLeafNodes(node.right);
	}
}
