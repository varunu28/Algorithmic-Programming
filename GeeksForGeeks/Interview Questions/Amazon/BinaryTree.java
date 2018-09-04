public class BinaryTree {
    public Node convertToTree(int[] arr) {
        return convertToTreeImpl(arr, 0, arr.length-1);
    }

    private Node convertToTreeImpl(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end)/2;
        Node node = new Node(arr[mid]);

        node.left = convertToTreeImpl(arr, start, mid-1);
        node.right = convertToTreeImpl(arr, mid+1, end);

        return node;
    }
}

