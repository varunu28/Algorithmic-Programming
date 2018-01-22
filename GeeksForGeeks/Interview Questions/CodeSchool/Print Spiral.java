// Print an array in spiral order
// O(logN)

public class Solution {
    
    public static void main(String[] args) {
        
        int[][] arr = {{2,4,6,8}, {5, 9, 12, 16}, {2, 11, 5, 9}, {3, 2, 1, 8}};
        printSpiral(arr, arr.length, arr[0].length);
        
    }
    
    private static void printSpiral(int[][] arr, int m, int n) {
        
        int t = 0;
        int b = m-1;
        int l = 0;
        int r = n-1;
        int dir = 0;
        
        while(t <= b && l <= r) {

            // Left -> Right
            if (dir == 0) {
                for (int i=l; i<=r; i++) {
                    System.out.print(arr[t][i] + " ");
                } 
                t++;
                dir = 1;
            }
            
            // Top -> Bottom
            else if (dir == 1) {
                for (int i=t;i<=b;i++) {
                    System.out.print(arr[i][r] + " ");
                }
                r--;
                dir = 2;
            }
            
            // Right -> Left
            else if (dir == 2) {
                for (int i=r; i>=l;i--) {
                    System.out.print(arr[b][i] + " ");
                }
                b--;
                dir = 3;
            }
            
            // Bottom -> Top
            else if (dir == 3) {
                for (int i=b; i>=t; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
                dir = 0;
            }
        }
    }
}