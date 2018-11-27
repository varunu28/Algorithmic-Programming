/*
Given an input stream of N characters consisting only of lower case alphabets. The task is to find the first 
non-repeating character, each time a character is inserted to the stream. If no non repeating element is found print -1.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String stream = br.readLine().replace(" ", "");

            final boolean[] hasOccured = new boolean[256];
            final List<Character> characters = new ArrayList<>();

            for (char c : stream.toCharArray()) {
                if (!hasOccured[c]) {
                    hasOccured[c] = true;
                    characters.add(c);
                }
                else {
                    for (int i = 0; i < characters.size(); i++) {
                        if (characters.get(i) == c) {
                            characters.remove(i);
                            break;
                        }
                    }
                }

                System.out.print((characters.size() == 0 ? String.valueOf(-1) : String.valueOf(characters.get(0))) + " \n");
            }

            System.out.println();
        }
    }
}
