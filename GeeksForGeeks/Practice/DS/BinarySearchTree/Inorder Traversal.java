/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class GfG {
    void inOrder(Node root)
    {
       if (root == null) {
           return;
       }
       
       inOrder(root.left);
       System.out.print(root.data + " ");
       inOrder(root.right);
    }
}
