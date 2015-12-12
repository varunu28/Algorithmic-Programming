import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            br.readLine();
            String s = br.readLine();
            int eq_n=s.indexOf("=");
            int plus_n=s.indexOf("+");
            int machula=s.indexOf("machula");

            if(machula>eq_n)
            {
                int num1=Integer.parseInt(s.substring(0, plus_n-1));
                int num2=Integer.parseInt(s.substring(plus_n+2, eq_n-1));
                out.write(String.valueOf(num1)+" + "+String.valueOf(num2)+" = "+String.valueOf(num1+num2)+"\n");
            }
            else
            {
                if(machula>plus_n)
                {
                    int num1=Integer.parseInt(s.substring(0, plus_n-1));
                    int num2=Integer.parseInt(s.substring(eq_n+2));
                    out.write(String.valueOf(num1)+" + "+String.valueOf(num2-num1)+" = "+String.valueOf(num2)+"\n");
                }
                else if(machula<plus_n)
                {
                    int num1=Integer.parseInt(s.substring(plus_n+2, eq_n-1));
                    int num2=Integer.parseInt(s.substring(eq_n+2));
                    out.write(String.valueOf(num2-num1)+" + "+String.valueOf(num1)+" = "+String.valueOf(num2)+"\n");
                }
            }
        }
            out.flush();
            out.close();
    }
}