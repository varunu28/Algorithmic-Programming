import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int d = Integer.parseInt(br.readLine());
        int y = d/365;
        d = d%365;
        int m = d/30;
        d = d%30;
        System.out.println(y + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");
    }
}