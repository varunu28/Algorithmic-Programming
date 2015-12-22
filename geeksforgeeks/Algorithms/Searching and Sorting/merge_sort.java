import java.util.*;
public class Main {
	static void merge(int arr[], int l, int m, int r) //Merge Function
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    int L[] = new int[n1];
	    int R[] = new int[n2];
	 
	    for(i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for(j = 0; j < n2; j++)
	        R[j] = arr[m + 1+ j];
	 
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
	
	static void mergeSort(int arr[],int l,int r) //Merge Sort Function
	{
		if(r>l)
		{
			int mid =(l+r)/2;
			
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr, l, mid, r);
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]={12,11,5,3,6,343,2,43,1,232,45};
		int n = arr.length;
		
		mergeSort(arr,0,n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}  
}