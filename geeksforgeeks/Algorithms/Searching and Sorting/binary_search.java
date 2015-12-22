import java.util.*;
public class Main {
	static int binarySearch(int arr[] , int l, int r , int x)
	{
		if(r>=l)
		{
			int mid = l + (r-l)/2;
			
			if(arr[mid]==x)
			{
				return mid;
			}
			
			if(arr[mid]>x)
			{
				return binarySearch(arr,l,mid-1,x);
			}
			else
			{
				return binarySearch(arr, mid+1, r, x);
			}
		}
		return -1;
	}
	
	static int binarySearchIterative(int arr[], int l, int r, int x) // Iterative Approach 
	{
	  while (l <= r)
	  {
	    int m = l + (r-l)/2;
	 
	    if (arr[m] == x) return m;  
	 
	    if (arr[m] < x) l = m + 1; 
	 
	    else r = m - 1; // 
	  }
	  return -1; // 
	}
	public static void main(String[] args) 
	{
		int arr[] = {2, 3, 4, 10, 40};
		int n = arr.length;
	    int x = 10;
  	    int result = binarySearch(arr, 0, n-1, x);
  	    
  	    if(result==-1)
  	    {
  	    	System.out.println("No index found");
  	    }
  	    else
  	    {
  	    	System.out.println("Value is present on index no: "+ result);
  	    }
	}  
}