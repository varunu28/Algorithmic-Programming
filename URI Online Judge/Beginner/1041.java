import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        float x = Float.parseFloat(strs[0]);
        float y = Float.parseFloat(strs[1]);

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        else if (x>0 && y>0){
            System.out.println("Q1");
        }
        else if (x>0 && y<0){
            System.out.println("Q4");
        }
        else if (x<0 && y>0){
            System.out.println("Q2");
        }
        else {
            System.out.println("Q3");
        }
    }
}