import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        char[] arr = str.toCharArray();

        boolean flag = false;

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                sb.append(arr[i]).append(arr[i+1]);
                System.out.println("YES");
                System.out.println(sb.toString());
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("NO");
        }
    }
}
