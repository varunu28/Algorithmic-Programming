import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());
        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        int total = 0;
        for(int i=0;i<strs.length;i++){
            total += Integer.parseInt(strs[i]);
        }

        Double frac = (Double.valueOf(total))/(n);

        System.out.print(frac);
    }
}
