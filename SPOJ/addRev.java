import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

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
        	String inp=br.readLine();
        	
        	String[] numbers=inp.split(" ");
        	
        	int a = Integer.parseInt(numbers[0]);
        	int b = Integer.parseInt(numbers[1]);
        	
        	System.out.println(num_rev(num_rev(a)+num_rev(b)));
        	n--;
        }
    }
}
    