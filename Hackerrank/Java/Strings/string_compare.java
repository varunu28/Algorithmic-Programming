//import java.io.*;
import java.util.*;

public class string_compare {

    public static void main(String[] args) {
    	
    	
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int n=sc.nextInt();
        
        int sub_n=A.length()-n+1;
        int i=0;
        String[] sub=new String[sub_n];
        
        
        while(i<sub_n)
        {
        	sub[i]=A.substring(i,i+n);
        	i++;
        }
        sc.close();
         
        i=0;
        String max_ans=sub[i];
        String min_ans=sub[i];
        
        while(i<sub_n)
        {
        	if(max_ans.compareTo(sub[i])<0)
        	{
        		max_ans=sub[i];
        	}
        	if(min_ans.compareTo(sub[i])>0)
        	{
        		min_ans=sub[i];
        	}
        	i++;
        }
        
        System.out.println(min_ans);
        System.out.println(max_ans);
    }
}
