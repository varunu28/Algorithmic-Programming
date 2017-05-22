import java.io.*;

public class solver {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        String inp = br.readLine();
        int upper = 0;
        int lower = 0;

        for(int i=0;i<inp.length();i++){
            if(inp.charAt(i) >= 'a' && inp.charAt(i) <= 'z'){
                lower++;
            }
            else{
                upper++;
            }
        }

        if(upper > lower){
            System.out.print(inp.toUpperCase());
        }
        else{
            System.out.print(inp.toLowerCase());
        }
    }
}
