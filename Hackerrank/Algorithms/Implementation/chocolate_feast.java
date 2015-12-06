//Chocolate Feast

import java.util.*;

public class Solution {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
        {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int choc=n/c;
            int wrap=n/c;
            int extra;
            
            while(wrap>=m)
                {
                    extra=0;
                    extra+=wrap/m;
                    choc+=extra;
                    wrap=wrap- extra*m;
                    wrap+=extra;
                }
            System.out.println(choc);
            t--;
        }
    }
}
