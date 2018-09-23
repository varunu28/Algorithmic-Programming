class SizeOfBinaryTree {
	public static int size(TreeNode root){
        if (root == null) {
            return 0;
        }
        
        return 1 + size(root.left) + size(root.right);
	}
}
