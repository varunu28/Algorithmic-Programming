import java.io.*;
import java.util.Scanner;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
            arr[sc.nextInt()]=i;
        int m = sc.nextInt();
        long sum1 =0;
        long sum2 = 0;
        for(int i=0;i<m;i++)
        {
            int x = sc.nextInt();
            sum1+=arr[x];
            sum2+=n-arr[x]+1;
        }
        System.out.println(sum1+" "+sum2);
    }
}