import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t,x;
        String[] strs = br.readLine().trim().split("\\s+");
        t = Integer.parseInt(strs[0])-1;
        x = Integer.parseInt(strs[1]);
        TreeNode root = new TreeNode(x);

        while (t>0) {
            String s = br.readLine();
            int val = Integer.parseInt(br.readLine());
            TreeNode ptr = root;
            int i = 0;
            while(i<s.length() && ptr != null) {
                if (s.charAt(i) == 'L') {
                    if (ptr.left == null) {
                        ptr.left = new TreeNode(val);
                    }
                    ptr = ptr.left;
                }
                else {
                    if (ptr.right == null) {
                        ptr.right = new TreeNode(val);
                    }
                    ptr = ptr.right;
                }
                i++;
            }
            t--;
        }

        System.out.println(Diameter(root));
    }

    public static int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    public static int Diameter(TreeNode root) {
        if (root != null) {
            int leftH = findHeight(root.left);
            int rightH = findHeight(root.right);

            int leftD = Diameter(root.left);
            int rightD = Diameter(root.right);

            return Math.max(leftH+rightH+1,Math.max(leftD,rightD));
        }
        return 0;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
