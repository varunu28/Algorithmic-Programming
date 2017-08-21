import java.util.*;
public class Solution {

    static void partition(int[] arr) {
        int piv = arr[0];
        ArrayList<Integer> lessArr = new ArrayList<>();
        ArrayList<Integer> greatArr = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < piv) {
                lessArr.add(arr[i]);
            }
            else if (arr[i] > piv) {
                greatArr.add(arr[i]);
            }
        }

        for (int i=0;i<lessArr.size();i++) {
            System.out.print(lessArr.get(i) + " ");
        }

        System.out.print(piv + " ");

        for (int i=0;i<greatArr.size();i++) {
            System.out.print(greatArr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}
