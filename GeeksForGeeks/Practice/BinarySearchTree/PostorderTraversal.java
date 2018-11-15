class PostorderTraversal {
    void postOrder(Node root) {
        if (root == null) return;
        
        Stack<Node> stack1 = new Stack();
        Stack<Node> stack2 = new Stack();
        
        stack1.push(root);
        
        while(!stack1.empty()) {
            Node popped = stack1.pop();
            stack2.push(popped);
            
            if (popped.left != null) {
                stack1.push(popped.left);
            }
            
            if (popped.right != null) {
                stack1.push(popped.right);
            }
        }
        
        while (!stack2.empty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }
}
