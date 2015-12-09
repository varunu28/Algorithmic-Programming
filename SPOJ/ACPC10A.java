//ACPC10A

import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
       while(true)
       {
        	String inp = br.readLine();
	        String[] inp_arr=inp.split(" ");
	        	
	        	int a1 = Integer.parseInt(inp_arr[0]); 
	        	int a2 = Integer.parseInt(inp_arr[1]); 
	        	int a3 = Integer.parseInt(inp_arr[2]);
	        	if(a1==0 && a2==0 && a3==0)
	        	{
	        		break;
	        	}
	        	else
	        	{
		        	if(a2-a1==a3-a2)
		        	{
		        		int ans=a3 + (a3-a2);
		        		String ans_str = String.valueOf(ans);
		        		System.out.println("AP "+ans_str);
		        	}
		        	else if(a2/a1==a3/a2)
		        	{
		        		int ans=a3*(a3/a2);
		        		String ans_str = String.valueOf(ans);
		        		System.out.println("GP "+ans_str);
		        	}
	        	}
        	}
       }
    }

