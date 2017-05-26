import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int[] num = {61,71,11,21,32,19,27,31};
        String[] code = {"Brasilia", "Salvador","Sao Paulo","Rio de Janeiro","Juiz de Fora","Campinas","Vitoria","Belo Horizonte"};

        int n = Integer.parseInt(br.readLine());
        int c = 0;
        for(int i=0;i<num.length;i++){
            if (num[i] == n){
                System.out.println(code[i]);
                c = 1;
            }
        }

        if (c == 0) {
            System.out.println("DDD nao cadastrado");
        }
    }
}