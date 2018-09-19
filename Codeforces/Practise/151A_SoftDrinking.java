import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        int l = Integer.parseInt(strs[2]);
        int c = Integer.parseInt(strs[3]);
        int d = Integer.parseInt(strs[4]);
        int p = Integer.parseInt(strs[5]);
        int nl = Integer.parseInt(strs[6]);
        int np = Integer.parseInt(strs[7]);

        System.out.print(Math.min((k*l)/nl, Math.min(c*d, p/np))/n);

    }
}
