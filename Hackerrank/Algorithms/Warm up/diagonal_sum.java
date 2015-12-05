//Diagonal Sum

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int inp[][]=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		inp[i][j] = in.nextInt();
        	}
        }
        
        int sum1=0;
       
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(i==j)
        		{
        			sum1+=inp[i][j];
        		}
        	}
        }
        
        int sum2=0;
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(i+j==n-1)
        		{
        			sum2+=inp[i][j];
        		}
        	}
        }
        
        System.out.println(Math.abs(sum1-sum2));
    }
}
