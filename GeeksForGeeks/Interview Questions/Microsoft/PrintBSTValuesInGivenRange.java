public class PrintBSTValuesInGivenRange {

    public void printNearNodes(Node root, int low, int high) {
        if (root == null) {
            return;
        }

        printNearNodes(root.left, low, high);

        if (root.val >= low && root.val <= high) {
            System.out.print(root.val + " ");
        }

        printNearNodes(root.right, low, high);
    }
}
