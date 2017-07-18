import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class TestClass {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(br.readLine());
        while (t>0) {
            int n = Integer.parseInt(br.readLine());
            int[] rup = new int[n];
            int[] ank = new int[n];

            String[] strs = br.readLine().trim().split("\\s+");

            for (int i=0;i<n;i++) {
                rup[i] = Integer.parseInt(strs[i]);
            }

            strs = br.readLine().trim().split("\\s+");

            for (int i=0;i<n;i++) {
                ank[i] = Integer.parseInt(strs[i]);
            }

            Arrays.sort(rup);
            Arrays.sort(ank);

            int rupmaxCount = 1;
            int rupmaxWt = 0;

            int ankmaxCount = 1;
            int ankmaxWt = 0;

            int count = 1;

            for (int i=1;i<n;i++) {
                if (rup[i] == rup[i-1]) {
                    count++;
                }
                else {
                    if (rupmaxCount <= count) {
                        rupmaxCount = count;
                        rupmaxWt = Math.max(rupmaxWt,rup[i-1]);
                    }
                    count = 1;
                }
            }
            
            if (rupmaxCount <= count) {
                rupmaxCount = count;
                rupmaxWt = Math.max(rupmaxWt,rup[rup.length-1]);
            }
            count = 1;

            for (int i=1;i<n;i++) {
                if (ank[i] == ank[i-1]) {
                    count++;
                }
                else {
                    if (ankmaxCount <= count) {
                        ankmaxCount = count;
                        ankmaxWt = ank[i-1];
                    }
                    count = 1;
                }
            }
            
            if (ankmaxCount <= count) {
                ankmaxCount = count;
                ankmaxWt = Math.max(ankmaxWt,ank[ank.length-1]);
            }

            if (rupmaxCount == 1 && ankmaxCount == 1) {
                if (rup[rup.length-1] > ank[ank.length-1]) {
                    System.out.println("Rupam");
                }
                else if (rup[rup.length-1] < ank[ank.length-1]) {
                    System.out.println("Ankit");
                }
                else {
                    System.out.println("Tie");
                }
            }
            else {
                if (rupmaxWt > ankmaxWt) {
                    System.out.println("Rupam");
                }
                else if (rupmaxWt < ankmaxWt) {
                    System.out.println("Ankit");
                }
                else {
                    System.out.println("Tie");
                }
            }

            t--;
        }
    }
}
