import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);
        int d = Integer.parseInt(strs[3]);

        if (b>c && d>a && (c+d)>(b+a) && c>0 && d>0 && a%2==0){
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}