import java.io.*;
//Terrible Chandu

import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TestClass {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
                
        while(n>=0)
        {
        	String str=in.nextLine();

            char[] chars=str.toCharArray();
            
            for (int i = chars.length-1; i >=0; i--) {
                System.out.print(chars[i]);
            }
            System.out.println("");
            n--;
        }
       
    }
}
