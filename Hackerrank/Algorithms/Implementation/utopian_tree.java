//Utopian Tree

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            if(n==0)
            {
            	System.out.println(1);
            }
            else
            {
            	int ans=1;
            	int i=1;
            	while(i<=n)
            	{
            		if(i%2==1)
            		{
            			ans=ans*2;
            		}
            		else
            		{
            			ans++;
            		}
            		i++;
            	}
            	System.out.println(ans);
            }
        }
    }
}
