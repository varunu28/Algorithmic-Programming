import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int s = 0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            s += B[B_i];
        }
        if (s%2 != 0) {
            System.out.println("NO");
        }
        else {
            int numLoaves = 0;
            for (int i=0;i<N-1;i++) {
                if (B[i]%2 != 0) {
                    B[i]++;
                    B[i+1]++;
                    numLoaves += 2;
                }
            }
            
            System.out.println(numLoaves);
        }
        
    }
}

