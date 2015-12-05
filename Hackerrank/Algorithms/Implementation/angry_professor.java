import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t>0)
        {
        	int n = in.nextInt();
        	int k = in.nextInt();
        	int arr[]=new int[n];
        	
        	for(int i=0;i<n;i++)
        	{
        		arr[i]=in.nextInt();
        	}
        	
        	int abs_count=0;
        	
        	for(int i=0;i<n;i++)
        	{
        		if(arr[i]<=0)
        		{
        			abs_count++;
        		}
        	}
        	
        	if(abs_count<k)
        	{
        		System.out.println("YES");
        	}
        	else
        	{
        		System.out.println("NO");
        	}
        	t--;
        }
    }
}
