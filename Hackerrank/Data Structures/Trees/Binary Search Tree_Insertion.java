 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    
    if(root==null) {
        Node node=new Node();
        node.data=value;
        node.left=null;
        node.right=null;
        root=node;
    }
    else if(root.data>value)
        root.left=Insert(root.left,value);
    else if(root.data<value)
        root.right=Insert(root.right,value);

    return root;
}


