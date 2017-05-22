import java.io.*;

public class test {
    public static void main(String[] args) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String inp = br.readLine();
        StringBuilder ans = new StringBuilder("");

        int i = 0;
        int n = inp.length();
        while(i<n){
            if(inp.charAt(i) == '.'){
                ans.append('0');
                i++;
            }
            else {
                if(inp.charAt(i+1) == '-'){
                    ans.append('2');
                }
                else {
                    ans.append('1');
                }
                i += 2;
            }
        }
        System.out.println(ans);
    }
}