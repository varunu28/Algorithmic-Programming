import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }

        int maxCount = Integer.MIN_VALUE;
        int teamCount = Integer.MIN_VALUE;
        int l = topic.length;

        for (int i=0;i<l;i++) {
            for (int j=i+1;j<l;j++) {
                int count = 0;
                for (int k=0;k<m;k++) {
                    if (topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1') {
                        count++;
                    }
                }
                if (maxCount < count) {
                    maxCount = count;
                    teamCount = 1;
                }
                else if (maxCount == count) {
                    teamCount++;
                }
            }
        }
        System.out.println(maxCount);
        System.out.println(teamCount);
    }
}