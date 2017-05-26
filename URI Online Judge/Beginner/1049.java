import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String inp1 = br.readLine();
        String inp2 = br.readLine();
        String inp3 = br.readLine();


        if(inp1.equals("vertebrado")){
            if(inp2.equals("ave")){
                if (inp3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else {
                if (inp3.equals("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }
        else {
            if(inp2.equals("inseto")){
                if (inp3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else {
                if (inp3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
                else {
                    System.out.println("sanguessuga");
                }
            }
        }
    }
}