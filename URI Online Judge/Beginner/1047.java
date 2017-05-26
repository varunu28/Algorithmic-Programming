import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        int c = Integer.parseInt(strs[2]);
        int d = Integer.parseInt(strs[3]);

        int initial = a*60 + b;
        int end = c*60 + d;
        int duration = 0;

        if(a <= c){
            duration = end - initial;
            if(duration == 0)
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24,duration%60);
            else
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(duration - duration%60)/60,duration%60);
        }else{
            duration = (24*60 - initial) + end;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(duration - duration%60)/60,duration%60);
        }

    }
}