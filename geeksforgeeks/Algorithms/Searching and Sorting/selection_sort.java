import java.util.*;
public class Main {
	static void selectionSort(int arr[] , int n) //Selection Sort Function
	{
		int i,j,min_idx;
		
		for(i=0;i<n-1;i++)
		{
			min_idx=i;
			for (j = i+1; j < n; j++)
			{
				if (arr[j] < arr[min_idx])
				{
					min_idx = j;
				}
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {64, 25, 12, 22, 11};
		int n = arr.length;
		selectionSort(arr, n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}  
}