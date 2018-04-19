/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    int isBST(Node root) {
        // Your code here
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE) == true ? 1 : 0;
    }
    
    boolean isBSTUtil(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data < min || root.data > max) {
            return false;
        }
        
        return isBSTUtil(root.left, min, root.data-1) && 
                isBSTUtil(root.right, root.data+1, max);
    }
}
