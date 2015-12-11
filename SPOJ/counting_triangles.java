//Cut short the solution as the solution cannot be more than 500 bytes


import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;
public class Main {public static void main(String[] args) throws IOException {BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);int testcases = Integer.parseInt(in.readLine());
        while (testcases-- > 0) {long n = Long.parseLong(in.readLine());out.println(n*(n+2)*((n<<1)+1)>>3);}out.flush();}}