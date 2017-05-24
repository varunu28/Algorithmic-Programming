import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");
        int A = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);
        int C = Integer.parseInt(strs[2]);

        System.out.printf("%d eh o maior\n", Math.max(A, Math.max(B, C)));
    }
}