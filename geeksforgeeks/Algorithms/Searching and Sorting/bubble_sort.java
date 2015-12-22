import java.util.*;
public class Main {
	static void bubbleSort(int arr[],int n) //Bubble Sort Function with optimized implementation 
	{
		for(int i=0;i<n-1;i++)
		{
			int count=0;
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0)
			{
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[]={90,223,2,4,3,65,1,232};
		int n =arr.length;
		bubbleSort(arr,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}  
}