class ChildrenSumParent {
    public static int sum(Node root){
        if(root==null) {
            return 0;
        }
        
        if(root.left==null && root.right==null) {
            return root.data;
        }
        
        return sum(root.left)+sum(root.right);
    }

    public static int isSumProperty(Node node) {
        if(node==null) {
            return 1;
        }
        
        if(node.left==null && node.right==null) {
            return 1;
        }
        
        int s=sum(node.left)+sum(node.right);
        
        if(s==node.data) {
            return Math.min(isSumProperty(node.left), isSumProperty(node.right));
        }
        else {
            return 0;
        }
    }
}
