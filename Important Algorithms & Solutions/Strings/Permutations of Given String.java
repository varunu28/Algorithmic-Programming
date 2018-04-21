import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
    
    public static List<String> strings = new ArrayList<>();
    
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String s = br.readLine();
	        permute(s, 0, s.length()-1);
	        Collections.sort(strings);
	        System.out.println(String.join(" ", strings));
	        strings = new ArrayList<>();
	    }
	}
	
	public static void permute(String s, int l, int r) {
	    if (l == r) {
	        strings.add(s);        
	    }
	    else {
	        for (int i=l; i<=r; i++) {
	            s = swap(s, l, i);
	            permute(s, l+1, r);
	            s = swap(s, l, i);
	        }
	    }
	}
	
	public static String swap(String s, int id1, int id2) {
	    char[] ch = s.toCharArray();
	    char c = ch[id1];
	    ch[id1] = ch[id2];
	    ch[id2] = c;
	    
	    return String.valueOf(ch);
	}
}
