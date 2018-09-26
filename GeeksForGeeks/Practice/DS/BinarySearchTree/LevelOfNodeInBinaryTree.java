class LevelOfNodeInBinaryTree {
    public static int getLevel(Node root, int key) {
        int level = 1;
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            while (size-- > 0) {
                Node temp = queue.remove();
                if (temp.data == key) {
                    return level;
                }
                
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            
            level++;
        }
        
        return -1;
    }
}
