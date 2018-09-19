import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        int n,m;
        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        n = Integer.parseInt(strs[0]);
        m = Integer.parseInt(strs[1]);

        if(isPrime(m) == false){
            System.out.print("NO");
        }
        else{
            int c = 1;
            int k = n+1;
            while (k<m){
                if(isPrime(k)){
                    c = 0;
                    break;
                }
                k++;
            }
            if(c == 1){
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 2 || n == 3){
            return true;
        }
        else if(n <= 1){
            return false;
        }
        else{
            int i = 2;
            while (i <= (int)Math.pow(n,0.5)){
                if(n%i == 0){
                    return  false;
                }
                i++;
            }
            return true;
        }
    }
}
