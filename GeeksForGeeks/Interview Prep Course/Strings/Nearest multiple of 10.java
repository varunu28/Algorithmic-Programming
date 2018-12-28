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
	        out.println(getClosestMultiple(s));
	    }
	}
	
	private static String getClosestMultiple(String s) {
	    if (s.charAt(s.length() - 1) == '0') {
	        return s;
	    }
	     
	    String uptoFive = "12345";
	    
        if (s.length() == 1) {
	        if (uptoFive.indexOf(s) != -1) {
	            return "0";
	        }    
	        else {
	            return "10";
	        }
	    }
	    
	    if (uptoFive.indexOf(s.charAt(s.length() - 1)) != -1) {
	        return s.substring(0, s.length() - 1) + "0";
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append('0');
	    
	    int carry = 1;
	    for (int i=s.length()-2; i>=0; i--) {
	        int num = Character.getNumericValue(s.charAt(i)) + carry;
	        if (num > 9) {
	            sb.append('0');
	        }
	        else {
	            sb.append(num);
	            carry = 0;
	            sb.append(new StringBuilder().append(s.substring(0, i)).reverse().toString());
	            break;
	        }
	    } 
	    
	    if (carry == 1) {
	        sb.append(carry);
	    }
	    
	    return sb.reverse().toString();
	}
}
