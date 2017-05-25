import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        float n1 = Float.parseFloat(strs[0]);
        float n2 = Float.parseFloat(strs[1]);
        float n3 = Float.parseFloat(strs[2]);
        float n4 = Float.parseFloat(strs[3]);

        float med = (2*n1 + 3*n2 + 4*n3 + n4)/10;
        System.out.printf("Media: %.1f\n",med);

        if(med >= 7){
            System.out.println("Aluno aprovado.");
        }
        else if(med < 5){
            System.out.println("Aluno reprovado.");
        }
        else if (med>=5 && med < 7){
            System.out.println("Aluno em exame.");
            float n = Float.parseFloat(br.readLine());
            System.out.printf("Nota do exame: %.1f\n",n);
            med = (med + n)/2;
            if(med >= 5){
                System.out.println("Aluno aprovado.");
            }
            else if (med <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",med);
        }
    }
}