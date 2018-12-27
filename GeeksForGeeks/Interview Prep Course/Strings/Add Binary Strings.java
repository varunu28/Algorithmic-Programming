import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String[] s = br.readLine().split("\\s+");
	        String b1 = s[0];
	        String b2 = s[1];
	        
	        out.println(getSum(b1, b2));
	    }
	}
	
	private static String getSum(String b1, String b2) {
	    int carry = 0;
	    int i = b1.length() - 1;
	    int j = b2.length() - 1;
	    StringBuilder sb = new StringBuilder();
	    
	    while (i >= 0 && j >= 0) {
	        if (b1.charAt(i) == '1' && b2.charAt(j) == '1') {
	            if (carry == 1) {
	                sb.append('1');
	            }
	            else {
	                sb.append('0');
	            }
	            carry = 1;
	        }
	        else if (b1.charAt(i) == '0' && b2.charAt(j) == '0') {
	            if (carry == 1) {
	                sb.append('1');
	            }
	            else {
	                sb.append('0');
	            }
	            
	            carry = 0;
	        }
	        else {
	            if (carry == 1) {
	                sb.append('0');
	            }
	            else {
	                sb.append('1');
	            }
	        }
	        
	        i--;
	        j--;
	    }
	    
	    while (i >= 0) {
	        if (b1.charAt(i) == '1') {
                if (carry == 1) {
                    sb.append('0');
                }
                else {
                    sb.append('1');
                }
	        }
	        else {
                if (carry == 1) {
                    sb.append('1');
                }
                else {
                    sb.append('0');
                }
                
                carry = 0;
	        }
	        
	        i--;
	    }
	    
	    while (j >= 0) {
	        if (b2.charAt(j) == '1') {
                if (carry == 1) {
                    sb.append('0');
                }
                else {
                    sb.append('1');
                }
	        }
	        else {
                if (carry == 1) {
                    sb.append('1');
                }
                else {
                    sb.append('0');
                }
                
                carry = 0;
	        }
	        
	        j--;
	    }
	    
	    if (carry == 1) {
	        sb.append('1');
	    }
	    
	    return sb.reverse().toString();
	}
}
