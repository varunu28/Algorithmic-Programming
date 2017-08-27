import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int ht1 = 0;
        int ht2 = 0;
        int ht3 = 0;
        
        int ans = 0;
        
        ArrayList<Integer> h1 = new ArrayList<Integer>();
        ArrayList<Integer> h2 = new ArrayList<Integer>();
        ArrayList<Integer> h3 = new ArrayList<Integer>();
        
        ArrayList<Integer> sum_h1 = new ArrayList<Integer>();
        ArrayList<Integer> sum_h2 = new ArrayList<Integer>();
        ArrayList<Integer> sum_h3 = new ArrayList<Integer>();
        
        for(int h1_i=n1-1; h1_i >= 0; h1_i--){
            int num = in.nextInt();
            h1.add(num);
        }
       
        for(int h2_i=n2-1; h2_i >= 0; h2_i--){
            int num = in.nextInt();
            h2.add(num);
        }
        
        for(int h3_i=n3-1; h3_i >= 0; h3_i--){
            int num = in.nextInt();
            h3.add(num);
        }
        
        Collections.reverse(h1);
        Collections.reverse(h2);
        Collections.reverse(h3);
        
        for (int i=0;i<n1;i++) {
            ht1 += h1.get(i);
            sum_h1.add(ht1);
        }
        
        for (int i=0;i<n2;i++) {
            ht2 += h2.get(i);
            sum_h2.add(ht2);
        }
        
        for (int i=0;i<n3;i++) {
            ht3 += h3.get(i);
            sum_h3.add(ht3);
        }
        
        Collections.reverse(sum_h1);
        Collections.reverse(sum_h2);
        Collections.reverse(sum_h3);
        
        if (n1 <= n2 && n1 <= n3) {
            for (int i=0;i<n1;i++) {
                if (sum_h2.indexOf(sum_h1.get(i)) != -1 && sum_h3.indexOf(sum_h1.get(i)) != -1) {
                    ans = sum_h1.get(i);
                    break;
                }
            }
        }
        else if (n2 <= n1 && n2 <= n3) {
            for (int i=0;i<n2;i++) {
                if (sum_h1.indexOf(sum_h2.get(i)) != -1 && sum_h3.indexOf(sum_h2.get(i)) != -1) {
                    ans = sum_h2.get(i);
                    break;
                }
            }
        }
        else if (n3 <= n2 && n3 <= n1) {
            for (int i=0;i<n3;i++) {
                if (sum_h1.indexOf(sum_h3.get(i)) != -1 && sum_h2.indexOf(sum_h3.get(i)) != -1) {
                    ans = sum_h3.get(i);
                    break;
                }
            }
        }
       
        System.out.println(ans);
    }
}
