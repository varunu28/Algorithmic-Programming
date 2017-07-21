import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    static int maximumGcdAndSum(int[] A, int[] B) {
        // Complete this function
        Arrays.sort(A);
        Arrays.sort(B);
        int maxNum = Math.max(A[A.length-1], B[B.length-1]);
        Map<Integer, Integer> AList = new HashMap<Integer, Integer>();
        Map<Integer, Integer> BList = new HashMap<Integer, Integer>();

        for (int index = 0; index < A.length; index++)
        {
            AList.put(A[index],A[index]);
        }

        for (int index = 0; index < B.length; index++)
        {
            BList.put(B[index],B[index]);
        }

        int ansA = 0;
        int ansB = 0;

        for (int i=maxNum;i>0;i--) {
            boolean flagA = false;
            boolean flagB = false;
            for (int j=(maxNum/i)*i;j>=i;j-=i) {
                if (AList.containsKey(j)) {
                    ansA = j;
                    flagA = true;
                    break;
                }
            }
            
            if (flagA) {
                for (int j=(maxNum/i)*i;j>=i;j-=i) {
                    if (BList.containsKey(j)) {
                        ansB = j;
                        flagB = true;
                        break;
                    }
                }
            }

            if (flagA && flagB) {
                break;
            }
        }
        return ansA + ansB;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        int res = maximumGcdAndSum(A, B);
        System.out.println(res);
    }
}
