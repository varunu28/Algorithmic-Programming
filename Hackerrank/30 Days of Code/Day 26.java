import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        String[] strs = br.readLine().trim().split("\\s+");
        
        int[] dayReturned = new int[3];
        for (int i=0;i<3;i++) {
            dayReturned[i] = Integer.parseInt(strs[i]);
        }
        
        strs = br.readLine().trim().split("\\s+");
        
        int[] actualDayReturned = new int[3];
        for (int i=0;i<3;i++) {
            actualDayReturned[i] = Integer.parseInt(strs[i]);
        }
        
        int fine = 0;
        
        if(dayReturned[2] == actualDayReturned[2] && dayReturned[1] == actualDayReturned[1] && dayReturned[0] > actualDayReturned[0]) {
            fine += 15*(dayReturned[0] - actualDayReturned[0]);
        }
        else if(dayReturned[2] == actualDayReturned[2] && dayReturned[1] > actualDayReturned[1]) {
            fine += 500*(dayReturned[1] - actualDayReturned[1]);
        }
        else if (dayReturned[2] > actualDayReturned[2]) {
            fine = 10000;
        }
        
        System.out.println(fine);
    }
}
