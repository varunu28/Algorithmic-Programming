class SumOfLeafNodesAtMinLevel {
 
   public int minLeafSum(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<Node> list = new ArrayList<>();
        boolean flag = false;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            while (size-- > 0) {
                Node temp = queue.remove();
                if (temp.left == null && temp.right == null) {
                    flag = true;
                    list.add(temp);
                }
                
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            
            if (flag) {
                break;
            }
        }
        
        int sum  = 0;
        
        for (Node node : list) {
            sum += node.data;
        }
        
        return sum;
    }
}
