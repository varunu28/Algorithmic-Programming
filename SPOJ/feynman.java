import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	    	while(true)
	    	{
	    		int n = Integer.parseInt(br.readLine());
	    		if(n==0)
	    		{
	    			break;
	    		}
	    		else
	    		{
	    			long sum=0;
	    			while(n>0)
	    			{
	    				sum+=n*n;
	    				n--;
	    			}
	    			out.write(String.valueOf(sum)+"\n");
	    		}
	    	}
	        out.flush();
	        out.close();
	}
}
