import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class competitive_programming {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int i=1;
        int c;
        int	j=n-i;
        int k=1;
        
        while(k<=n)
        {
        	c=1;
        	while(c<=j)
        	{
        		System.out.print(" ");
        		c++;
        	}
        	
        	j--;
        	c=1;
        	
        	while(c<=i)
        	{
        		System.out.print("#");
        		c++;
        	}
        	
        	i++;
        	c=1;
        	System.out.println("");
        	
        	k++;
        }
    }
}
