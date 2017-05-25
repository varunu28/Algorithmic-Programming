import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);
        int z = Integer.parseInt(strs[2]);

        int[] num = new int[3];
        num[0] = Math.max(Math.max(x,y),z);
        num[2] = Math.min(Math.min(x,y),z);
        num[1] = Math.max(Math.min(x,y), Math.min(Math.max(x,y),z));

        for (int i=2;i>=0;i--){
            System.out.println(num[i]);
        }

        System.out.println();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}