import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	while(true)
    	{
    		int n=Integer.parseInt(br.readLine());
    		if(n==-1)
    		{
    			break;
    		}
    		else
    		{
	    		int[] arr = new int[n];
	    		
	    		for(int i=0;i<n;i++)
	    		{
	    			arr[i]=Integer.parseInt(br.readLine());
	    		}
	    		int sum=IntStream.of(arr).sum();
	    		
	    		double avg=((double)sum)/n;
	    		
	    		
	    		if (avg == (int)avg)
	    		{
	    			int count=0;
	    			for(int i=0;i<n;i++)
	    			{
	    				if(arr[i]<avg)
	    				{
	    					count+=avg-arr[i];
	    					
	    				}
	    			}
	    			
	    			System.out.println(count);
	    		}
	    		else
	    		{
	    			System.out.println(-1);
	    		}
    		}
    	}
    }
}