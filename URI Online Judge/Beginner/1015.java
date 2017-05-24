import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        float x1 = Float.parseFloat(strs[0]);
        float y1 = Float.parseFloat(strs[1]);

        lines = br.readLine();
        strs = lines.trim().split("\\s+");

        float x2 = Float.parseFloat(strs[0]);
        float y2 = Float.parseFloat(strs[1]);

        System.out.printf("%.4f\n",Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5));
    }
}