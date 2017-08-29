import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FastIO {
    
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s=new FastReader();
        int g = s.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = s.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = s.nextInt();
            }
           
            int sum = 0;
            int temp = 0;
            int c = 0;
            int i = 0;
            int j = 0;
            
            while (i < n && sum + a[i] <= x) {
                sum += a[i];
                i++;
            }
            
            c = i;
            while (j<m && i>=0) {
                sum += b[j];
                j++;
                while (sum > x && i>0) {
                    i--;
                    sum -= a[i];
                }
                if (sum <= x && i+j>c) {
                    c = i+j;
                }
            }
            
            System.out.println(c);
        }
    }
}
