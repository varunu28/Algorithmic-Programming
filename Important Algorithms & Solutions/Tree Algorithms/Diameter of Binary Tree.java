/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
   /* Complete the function to get diameter of a binary tree */
    int diameter(Node node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        int leftDiam = diameter(node.left);
        int rightDiam = diameter(node.right);
        
        return Math.max(1+leftHeight+rightHeight, Math.max(diameter(node.left), diameter(node.right)));
    }
    
    int height(Node node) {
         // Your code here
         if (node == null) return 0;
         return 1 + Math.max(height(node.left), height(node.right)); 
    }   
}
