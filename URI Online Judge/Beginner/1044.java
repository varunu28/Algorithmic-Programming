import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        if (a%b == 0 || b%a == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
}