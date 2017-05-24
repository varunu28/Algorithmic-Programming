import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int t = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        int d = s*t;

        System.out.printf("%.3f\n",(float)d/12);
    }
}