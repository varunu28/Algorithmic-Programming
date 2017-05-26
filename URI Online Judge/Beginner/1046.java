import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int start = Integer.parseInt(strs[0]);
        int end = Integer.parseInt(strs[1]);

        if (start == end){
            System.out.println("O JOGO DUROU " + 24 + " HORA(S)");
        }
        else if (start > end) {
            System.out.println("O JOGO DUROU " + (24 - start + end) + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU " + (end - start) + " HORA(S)");
        }
    }
}