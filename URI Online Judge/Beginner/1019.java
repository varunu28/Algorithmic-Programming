import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int s = Integer.parseInt(br.readLine());
        int h = s/3600;
        s = s%3600;
        int m = s/60;
        s = s%60;
        System.out.println(h + ":" + m + ":" + s);
    }
}