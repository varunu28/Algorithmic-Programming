import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());
        System.out.println(n*2 + " minutos");

    }
}