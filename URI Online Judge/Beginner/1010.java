import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        float total = 0;
        for(int i=0;i<2;i++){
            String  lines = br.readLine();
            String[] strs = lines.trim().split("\\s+");
            total += Float.parseFloat(strs[1])*Float.parseFloat(strs[2]);
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}