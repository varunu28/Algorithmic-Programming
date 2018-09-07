class LinkedListSort {
    public void linksort(Node head) {
        int[] arr = new int[3];

        Node curr = head;
        while (curr != null) {
            arr[curr.value]++;
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (arr[0] != 0) {
                curr.value = 0;
                arr[0]--;
            }
            else if (arr[1] != 0) {
                curr.value = 1;
                arr[1]--;
            }
            else {
                curr.value = 2;
                arr[2]--;
            }

            curr = curr.next;
        }
    }
}

