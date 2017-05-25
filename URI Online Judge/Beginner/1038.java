import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);

        if (x==1){
            System.out.printf("Total: R$ %.2f\n",(float)4*y);
        }
        else if (x==2){
            System.out.printf("Total: R$ %.2f\n",(float)4.5*y);
        }
        else if (x==3){
            System.out.printf("Total: R$ %.2f\n",(float)5*y);
        }
        else if (x==4){
            System.out.printf("Total: R$ %.2f\n",(float)2*y);
        }
        else if (x==5){
            System.out.printf("Total: R$ %.2f\n",(float)1.5*y);
        }
    }
}