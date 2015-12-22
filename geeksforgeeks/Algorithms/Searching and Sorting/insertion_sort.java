import java.util.*;
public class Main {
	static void InsertionSort(int arr[],int n) //Insertion Sort Function
	{
		for(int i=0;i<n;i++)
		{
			int m=i;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[m])
				{
					int temp=arr[j];
					arr[j]=arr[m];
					arr[m]=temp;
					m--;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[]={12,11,5,3,6,343,2,43,1,232,45};
		int n = arr.length;
		
		InsertionSort(arr,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}  
}