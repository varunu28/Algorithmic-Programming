import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String dir = br.readLine();
        String message = br.readLine();

        int change = dir.equals("R") ? -1 : 1;

        StringBuilder newMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            newMessage.append(keyboard.charAt(keyboard.indexOf(message.charAt(i)) + change));
        }

        System.out.println(newMessage.toString());
    }
}

