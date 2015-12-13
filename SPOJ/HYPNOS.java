import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
	
class Main{
	static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=(n%10)*(n%10);
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		int c=1;
		ArrayList<String> value=new ArrayList<String>();
		
		while(true)
		{
			count++;
			if(sum(n)==1)
			{
				break;
			}
			else
			{
				if(!value.contains(String.valueOf(sum(n))))
				{
					value.add(String.valueOf(sum(n)));
				}
				else
				{
					c=0;
					break;
				}
				n=sum(n);
			}
		}
		
		if(c==1)
		{
			System.out.println(count);
			//System.out.println(value);
		}
		else
		{
			System.out.println(-1);
			//System.out.println(value);
		}
		
		
        //out.flush();
        //out.close();
	}
}
