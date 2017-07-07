import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        System.out.print(fact(Math.min(a,b)));
    }

    static int fact(int n) {
        int f = 1;
        while (n>0) {
            f *= n;
            n--;
        }
        return f;
    }
}
