   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
      if (root.left != null) {
           root.left.right = null;
           topView(root.left);
       }
       
       System.out.print(root.data + " ");
       
       if (root.right != null) {
           root.right.left = null;
           topView(root.right);
       }
    }

