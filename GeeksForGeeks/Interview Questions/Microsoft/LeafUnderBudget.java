class LeafUnderBudget {
    
    public int getCount(Node node, int bud) {
        Queue<Node> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int level = 1;
        queue.add(node);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                Node temp = queue.remove();
                if (temp.left == null && temp.right == null) {
                    map.put(level, map.getOrDefault(level, 0) + 1);
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
        
        int height = getHeight(node);
        int count = 0;
        
        for (int i=1; i<=height; i++) {
            int leaves = map.getOrDefault(i, 0);
            while (leaves-- > 0) {
                if (bud >= i) {
                    bud -= i;
                    count++;
                }
                else {
                    break;
                }
            }
            
            if (bud <= 0) {
                break;
            }
        }
        
        return count;
    }
    
    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
