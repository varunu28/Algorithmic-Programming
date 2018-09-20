class BoundaryTraversalOfBinaryTree {
	void printBoundary(Node node) {
	    if (node == null) {
	        return;
	    }
	    
	    System.out.print(node.data + " ");
	    
	    printLeft(node.left);
	    printLeaves(node);
	    printRight(node.right);
	}
	
	private void printLeft(Node left) {
	    if (left == null) {
	        return;
	    }
	    
	    if (left.left != null) {
	        System.out.print(left.data + " ");
	        printLeft(left.left);
	    }
	    else if (left.right != null) {
	        System.out.print(left.data + " ");
	        printLeft(left.right);
	    }
	}
	
	private void printRight(Node right) {
	    if (right == null) {
	        return;
	    }
	    
	    if (right.right != null) {
	        printRight(right.right);
	        System.out.print(right.data + " ");
	    }
	    else if (right.left != null) {
	        printRight(right.left);
	        System.out.print(right.data + " ");
	    }
	}
	
	private void printLeaves(Node node) {
	    if (node == null) {
	        return;
	    }
	    
	    if (node.left == null && node.right == null) {
	        System.out.print(node.data + " ");
	    }
	    
	    printLeaves(node.left);
	    printLeaves(node.right);
	}
}
