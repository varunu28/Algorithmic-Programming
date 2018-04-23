/* Linked List
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
class GfG {
    void deleteNode(Node del) {
        int nextVal = del.next.data;
        del.data = nextVal;
        del.next = del.next.next;
    }
}
