/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below*/
class GfG
{
    public int getCount(Node head)
     {
      //add code here.
      int count = 0;
      while (head != null) {
          count++;
          head = head.next;
      }
      
      return count;
     }
}
