import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String s = br.readLine();
	        System.out.println(getDecimalValue(s));
	    }
	}
	
	private static int getDecimalValue(String s) {
	    int num = 0;
	    int pow = 0;
	    
	    char[] ch = s.toCharArray();
	    for (int i=ch.length-1; i>=0; i--) {
	        num += Math.pow(2, pow) * Character.getNumericValue(ch[i]);
	        pow++;
	    }
	    
	    return num;
	}
}
