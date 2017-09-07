   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       Queue<Node> q = new LinkedList<Node>();
       
       q.add(root);
       
       while(!q.isEmpty()) {
           Node n = q.remove();
           
           if (n.left != null) {
               q.add(n.left);
           }
           
           if (n.right != null) {
               q.add(n.right);
           }
           
           System.out.print(n.data + " ");
       }
    }

