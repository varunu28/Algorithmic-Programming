//Small Factorial

import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t>0)
        {
        	int n = Integer.parseInt(br.readLine());
        	BigInteger fact = BigInteger.valueOf(1);
        	
        	while(n>0)
        	{
        		fact=fact.multiply(BigInteger.valueOf(n));
        		n--;
        	}
        	
        	System.out.println(fact);
        	
        	t--;
        }
    }
}
