import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringPermutations {

    public static void main (String... args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (!str.isEmpty()) {
            printPermute(str, "");
        }
    }

    public static void printPermute(String s, String prefix) {
        
        if (s.isEmpty()) {
            System.out.println(prefix);
        }

        else {
            
            // choose/explore/unchoose
            for (int i=0;i<s.length();i++) {

                // Choose
                char c = s.charAt(i);
                prefix += c;
                s = s.substring(0, i) + s.substring(i+1);

                // Explore
                printPermute(s, prefix);

                // Unchoose
                s = new StringBuilder("").append(s).insert(i, c).toString();
                prefix = new StringBuilder("").append(prefix).deleteCharAt(prefix.length()-1).toString();

            }
        }
    }
}
