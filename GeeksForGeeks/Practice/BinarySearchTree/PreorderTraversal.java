class PreorderTraversal {
   /* Prints preorder traversal of Binary Tree.  In output
      all keys should be separated by space. For example
      preorder traversal of below tree should be "10 20 30"
         10
       /      \ 
    20       30 */
    public void preorder(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        
        stack.push(root);
        
        while(!stack.empty()) {
            Node popped = stack.pop();
            
            System.out.print(popped.data + " ");
            
            if (popped.right != null) {
                stack.push(popped.right);
            }
            
            if (popped.left != null) {
                stack.push(popped.left);
            }
        }
    }
}
