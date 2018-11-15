/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG {
	public Node inorderSuccessor(Node root,Node k) {
	    k = findK(root, k.data);
        if (k.right != null) {
            k = k.right;
            while (k.left != null) {
                k = k.left;
            }
            
            return k;
        }
        
        return lastLeft(root, k);
	}
	
	private Node findK(Node root, int k) {
	    if (root == null) {
	        return null;
	    }
	    if (root.data == k) {
	        return root;
	    }
	    else if (root.data < k) {
	        return findK(root.right, k);
	    }
	    else {
	        return findK(root.left, k);
	    }
	}
	
	private Node lastLeft(Node root, Node k) {
	    Node last = new Node(-1);
	    
	    while (root != null && root.data != k.data) {
	        if (root.data < k.data) {
	            root = root.right;
	        }
	        else if (root.data > k.data) {
	            last = root;
	            root = root.left;
	        }
	    }
	    
	    return last;
	}
}
