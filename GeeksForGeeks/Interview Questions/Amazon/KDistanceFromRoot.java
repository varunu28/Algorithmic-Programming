public class KDistanceFromRoot {

    public void printKDistanceFromRoot(Node root, int k) {
        printKDistanceFromRootImpl(root, k, 0);
    }

    private void printKDistanceFromRootImpl(Node root, int k, int distance) {
        if (root == null || distance > k) return;

        if (distance == k) {
            System.out.print(root.val + " ");
        }

        printKDistanceFromRootImpl(root.left, k, distance+1);
        printKDistanceFromRootImpl(root.right, k, distance+1);
    }
}

