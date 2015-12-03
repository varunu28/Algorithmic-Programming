import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {    
    public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
            float bankCharges = 0.50f;
            String values=null;
            values = br.readLine();
            String [] split = values.split(" ");
            float withdraw = Float.parseFloat(split[0]); 
            float amount = Float.parseFloat(split[1]);
            if (withdraw+bankCharges<=amount)
            {
                if(((int)withdraw) % 5 == 0){
                    amount=amount-(withdraw+bankCharges);
                    System.out.println(amount);
                }
                else System.out.println(amount);
            }
            else 
                System.out.println(amount);
    }
 
} 