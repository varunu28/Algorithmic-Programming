import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] revisedRussianRoulette(int[] doors) {
        // Complete this function
        int countOne = 0;
        for(int door : doors) {
            countOne += door;
        }
        
        int minCheck = 0;
        for(int i=0; i<doors.length; i++) {
            if (doors[i] == 1) {
                doors[i] = 0;
                minCheck++;
                if (i != doors.length-1 && doors[i+1] == 1) {
                    doors[i+1] = 0;
                }
            }
        }
        
        int[] ans = new int[2];
        ans[1] = countOne;
        ans[0] = minCheck;
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
