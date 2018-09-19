import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int anton = s.length() - s.replaceAll("A", "").length();
        int danik = s.length() - s.replaceAll("D", "").length();

        System.out.println(anton > danik ? "Anton" : anton == danik ? "Friendship" : "Danik");
    }
}

