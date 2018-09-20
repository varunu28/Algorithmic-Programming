class InsertNodeInBST {
   /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        if (root.data < data) {
            root.right = insert(root.right, data);
        }
        
        if (root.data > data) {
            root.left = insert(root.left, data);
        }
        
        return root;
    }
}
