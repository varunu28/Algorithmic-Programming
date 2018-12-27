import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String s1 = br.readLine();
	        String s2 = br.readLine();

            out.println(isRotation(s1, s2));
	    }
	}
	
	private static int isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return 0;
        }
        
        if (s1.equals(s2)) {
            return 1;
        }
        
        for (int i=0; i<s1.length(); i++) {
            s2 = rotate(s2);
            if (s1.equals(s2)) {
                return 1;
            }
        }
        
        return 0;
	}
	
	private static String rotate(String s) {
	    return new StringBuilder().
	                    append(s.substring(1)).
	                    append(s.charAt(0)).
	                    toString();
	}
}
