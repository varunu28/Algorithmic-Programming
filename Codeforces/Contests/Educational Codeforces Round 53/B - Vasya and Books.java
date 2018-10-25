import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] bookStatus = new int[n];

        String[] books = br.readLine().split("\\s+");
        Stack<Integer> stack = new Stack<>();
        for (int i=books.length-1; i>=0; i--) {
            stack.push(Integer.parseInt(books[i]));
        }

        int[] ans = new int[n];
        String[] backpack = br.readLine().split("\\s+");

        for (int i=0; i<backpack.length; i++) {
            int book = Integer.parseInt(backpack[i]);
            if (bookStatus[book-1] != 0) {
                ans[i] = 0;
                continue;
            }

            int count = 0;
            while (stack.peek() != book) {
                int popped = stack.pop();
                bookStatus[popped-1] = 1;
                count++;
            }

            int popped = stack.pop();
            bookStatus[popped-1] = 1;
            count++;

            ans[i] = count;
        }

        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
