import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        long a,b;

        while (sc.hasNext()) {
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(a^b);
        }
    }
}