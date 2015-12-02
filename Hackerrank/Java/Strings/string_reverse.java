//import java.io.*;
import java.util.*;

public class string_reverse {

    public static void main(String[] args) {
    	
    	
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String reverse =new StringBuffer(A).reverse().toString();
        
        if(reverse.equals(A))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
}
