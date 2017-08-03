import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution{
    public static void main(String [] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input=br.readLine();
            Stack st = new Stack();
            if (input.length() > 0) {
                boolean flag = true;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                        st.push(input.charAt(i));
                    } else {
                        if (!st.empty()) {
                            Character c = (Character) st.pop();
                            if (!((input.charAt(i) == '}' && c == '{') || (input.charAt(i) == ']' && c == '[') || (input.charAt(i) == ')' && c == '('))) {
                                flag = false;
                                break;
                            }
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                System.out.println(flag && st.empty());
            }
            else {
                break;
            }
        }
    }
}
