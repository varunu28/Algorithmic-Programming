import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr1 = new int[a];
        ArrayList<Integer> arrList2 = new ArrayList<>();

        for (int i=0;i<a;i++) {
            arr1[i] = Integer.parseInt(strs[i]);
        }

        int b = Integer.parseInt(br.readLine());
        strs = br.readLine().trim().split("\\s+");
        int[] arr2 = new int[b];

        for (int i=0;i<b;i++) {
            arr2[i] = Integer.parseInt(strs[i]);
            if (arrList2.indexOf(arr2[i]) == -1) {
                arrList2.add(arr2[i]);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0;i<arrList2.size();i++) {
            if (findCount(arr2, arrList2.get(i)) != findCount(arr1, arrList2.get(i)) && arr.indexOf(arrList2.get(i)) == -1) {
                arr.add(arrList2.get(i));
            }
        }

        int[] ansArr = new int[arr.size()];

        for (int i=0;i<arr.size();i++) {
            ansArr[i] = arr.get(i);
        }
        Arrays.sort(ansArr);

        for (int i=0;i<ansArr.length;i++) {
            System.out.print(ansArr[i] + " ");
        }
    }

    public static int findCount(int[] arr, int n) {
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }
}
