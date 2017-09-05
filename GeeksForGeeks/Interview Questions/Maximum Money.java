import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t>0) {
		    int n = in.nextInt();
		    int mon = in.nextInt();
		    
		    if (n%2 == 0) {
		        System.out.println(mon*(n/2));
		    }
		    else {
		        System.out.println(mon*(n/2 + 1));
		    }
		    t--;
		}
	}
}
