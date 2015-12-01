import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class loops {

    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        while(t>0)
            {
        	String inp = br.readLine();
        	String[] numbers = inp.split(" ");
        	
            int a=Integer.parseInt(numbers[0]);
            int b=Integer.parseInt(numbers[1]);
            int n=Integer.parseInt(numbers[2]);
            
            int sum=a;
            
            int i=0;
            while(i<n)
                {
                sum+=b*Math.pow(2,i);
                i++;
                System.out.print(sum+ " ");
            }
            System.out.println("");
            t--;
        }
    }
}