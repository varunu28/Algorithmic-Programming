/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    boolean isPalindrome(Node head)
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.data);
            head = head.next;
        }
        
        int i = 0;
        int j = arr.size()-1;
        
        while (i<j) {
            if (arr.get(i) != arr.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }   
}
