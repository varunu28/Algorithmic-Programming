import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());
        int i;
        if(n%2 == 1){
            System.out.print(-1);
        }
        else {
            i = 1;
            int o,e;
            while (i<n){
                o = i;
                e = i + 1;
                i += 2;
                System.out.print(e + " ");
                System.out.print(o + " ");
            }
        }
    }
}
