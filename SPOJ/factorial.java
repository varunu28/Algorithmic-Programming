//Factorial

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution1 {

	static int num_rev(int n)
	{
		int rev_n=0;
    	
    	while(n>0)
    	{
    		rev_n=rev_n*10 + n%10;
    		n/=10;
    	}
    	return rev_n;
    	
	}
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n>0)
        {
        	int a =Integer.parseInt(br.readLine());
        	int zero=0;
        	while(a>0)
        	{
        		zero+=a/5;
        		a/=5;
        	}
        	
        	System.out.println(zero);
        	n--;
        }
    }
}
    