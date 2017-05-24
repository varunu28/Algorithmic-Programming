import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());
        int[] notes = {100,50,20,10,5,2,1};

        System.out.println(n);
        for(int i=0;i<7;i++){
            System.out.println(n/notes[i] + " nota(s) de R$ " + notes[i] + ",00");
            n = n%notes[i];
        }
    }
}