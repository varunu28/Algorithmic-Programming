/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root) {
    StringBuilder sb = new StringBuilder("");
    Node temp = root;
    for (int i=0;i<S.length();i++) {
        if (S.charAt(i) == '0') {
            root = root.left;
            if (root.data != '\0') {
                sb.append(root.data);
                root = temp;
            }
        }
        else {
            root = root.right;
            if (root.data != '\0') {
                sb.append(root.data);
                root = temp;
            }
        }
    }
    
    System.out.println(sb.toString());
}

