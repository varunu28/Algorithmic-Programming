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
	        
	        printUncommon(s1, s2);
	    }
	}
	
	private static void printUncommon(String s1, String s2) {
	    Set<Character> set1 = new HashSet<>();
	    Set<Character> set2 = new HashSet<>();
	    
	    List<Character> list = new ArrayList<>();
	    
	    for (char c : s1.toCharArray()) {
	        set1.add(c);
	    }
	    
	    for (char c : s2.toCharArray()) {
	        set2.add(c);
	    }
	    
	    Iterator<Character> iter1 = set1.iterator();
	    Iterator<Character> iter2 = set2.iterator();
	    
	    while (iter1.hasNext()) {
	        Character c = iter1.next();
	        if (!set2.contains(c)) {
	            list.add(c);
	        }
	    }
	    
	    while (iter2.hasNext()) {
	        Character c = iter2.next();
	        if (!set1.contains(c)) {
	            list.add(c);
	        }
	    }
	    
	    Collections.sort(list);
	    
	    for (Character c : list) {
	        out.print(c);
	    }
	    
	    out.println();
	}
}
