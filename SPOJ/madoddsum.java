import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Main{
	static long add(int a, int b)
	{
		long sum=0;
		if(a%2==0)
		{
			a++;
		}
		if(b%2==0)
		{
			b--;
		}
		
		while(a<=b)
		{
			sum+=a;
			a+=2;
		}
		return sum;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    
	    	String s = br.readLine();
	    	String[] inp = s.split(" ");
	    	int a = Integer.parseInt(inp[0]);
	    	int b = Integer.parseInt(inp[1]);
	    	
	    	long sum = add(a,b);
	    
	    	out.write(String.valueOf(sum)+"\n");	
	        out.flush();
	        out.close();
	}
}
