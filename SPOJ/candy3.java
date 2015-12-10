import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.math.BigInteger;

class Main {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    long t=in.nextLong();
    
    while(t-->0)
    {
    	long n=in.nextLong();
    	long sum=0;
    	
    	for(long i=0;i<n;i++)
    	{
    		long k=in.nextLong();
    		sum+=k;
    		sum%=n;
    	}
    	
    	
    	
    	if(sum==0)
    	{
    		System.out.println("YES");
    	}
    	else
    	{
    		System.out.println("NO");
    	}
    }
  }
}