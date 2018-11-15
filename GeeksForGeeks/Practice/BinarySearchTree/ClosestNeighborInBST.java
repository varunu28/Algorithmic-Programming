/*class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
    
}*/
class GfG {
    public static int findMaxforKey(Node node, int val, int size) {
        int[] max = {-1};
        findMaxForKeyHelper(node, max, val);
        
        return max[0];
    }
    
    private static void findMaxForKeyHelper(Node node, int[] max, int val) {
        if (node == null) {
            return;
        }
        
        if (node.data == val) {
            max[0] = node.data;
            return;
        }
        
        if (node.data < val) {
            max[0] = Math.max(max[0], node.data);
            findMaxForKeyHelper(node.right, max, val);
        }
        else {
           findMaxForKeyHelper(node.left, max, val);
        }
    }
}
