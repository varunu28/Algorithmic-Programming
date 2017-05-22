import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());

        int[] left = new int[n];
        int[] right = new int[n];

        for(int i=0;i<n;i++){
            String  lines = br.readLine();
            String[] strs = lines.trim().split("\\s+");
            left[i] = Integer.parseInt(strs[0]);
            right[i] = Integer.parseInt(strs[1]);
        }
        int total = 0;

        int open=0;
        int close=0;

        for(int i=0;i<n;i++){
            if(left[i] == 1){
                open++;
            }
            else{
                close++;
            }
        }
        total += Math.min(open,close);

        open=0;
        close=0;

        for(int i=0;i<n;i++){
            if(right[i] == 1){
                open++;
            }
            else{
                close++;
            }
        }
        total += Math.min(open,close);

        System.out.print(total);
    }
}
