import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	int t=Integer.parseInt(br.readLine());
    	
    	while(t-->0)
    	{
    		int N=Integer.parseInt(br.readLine());
    		int[] MEN=new int[N];
    		int[] WOMEN=new int[N];
    		
    		
    		String MEN_str=br.readLine();
    		String WOMEN_str=br.readLine();
    		
    		String[] MEN_split=MEN_str.split(" ");
    		String[] WOMEN_split=WOMEN_str.split(" ");
    		
    		for(int i=0;i<N;i++)
    		{
    			MEN[i]=Integer.parseInt(MEN_split[i]);
    		}
    		
    		for(int i=0;i<N;i++)
    		{
    			WOMEN[i]=Integer.parseInt(WOMEN_split[i]);
    		}
    		
    		Arrays.sort(MEN);
    		Arrays.sort(WOMEN);
    		
    		int sum=0;
    		for(int i=0;i<N;i++)
    		{
    			sum+=MEN[i]*WOMEN[i];
    		}
    		
    		System.out.println(sum);
    	}
    }
}