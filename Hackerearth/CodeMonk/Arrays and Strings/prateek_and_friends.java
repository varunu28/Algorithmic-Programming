//Prateek and friends

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution1 {
    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t= Integer.parseInt(line);
        
        while(t>0)
        {
        	int b[]=new int[2];
        	String  lines = br.readLine();    

        	String[] strs = lines.trim().split("\\s+");
        	
        	for (int i = 0; i < 2; i++) {
        		b[i] = Integer.parseInt(strs[i]);
        	}
        	
        	int n=b[0];
        	int x=b[1];
        	
        	int a[]=new int[n];
        	
        	for(int i=0;i<n;i++)
        	{
        		a[i]=Integer.parseInt(br.readLine());
        	}
        	
        	int c=0;
        	
        	for(int i=0;i<n;i++)
        	{
        		int sum=0;
        		for(int j=i;j<n;j++)
        		{
        			sum+=a[j];
        			if(sum==x)
        			{
        				c=1;
        				break;
        			}
        		}
        		
        		if(c==1)
        		{
        			break;
        		}
        	}
        	
        	if(c==1)
        	{
        		System.out.println("YES");
        	}
        	else
        	{
        		System.out.println("NO");
        	}
        	
        	t--;
        }
        
    }
}
