import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class competitive_programming {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int count_neg=0;
        int count_pos=0;
        int count_zero=0;
        
        int i=0;
        
        while(i<n)
        {
        	if(arr[i]>0)
        	{
        		count_pos++;
        	}
        	else if(arr[i]<0)
        	{
        		count_neg++;
        	}
        	else if(arr[i]==0)
        	{
        		count_zero++;
        	}
        	
        	i++;
        }
        
        double pos_ans=count_pos/(double)n;
        double neg_ans=count_neg/(double)n;
        double zero_ans=count_zero/(double)n;
        
        String str_pos = String.format("%.6f", pos_ans );
        String str_neg = String.format("%.6f", neg_ans );
        String str_zero = String.format("%.6f", zero_ans );
        
        System.out.println(str_pos);
        System.out.println(str_neg);
        System.out.println(str_zero);
    }
}