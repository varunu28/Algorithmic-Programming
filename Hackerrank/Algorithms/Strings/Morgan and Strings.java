import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        while(t-- > 0) {
            String stringA = in.nextLine();
            String stringB = in.nextLine();

            int i = 0, j = 0;
            StringBuffer sb = new StringBuffer();

            while(i < stringA.length() && j < stringB.length()) {
                
                if (stringA.charAt(i) < stringB.charAt(j)) {
                    sb.append(stringA.charAt(i++));
                } else if (stringA.charAt(i) > stringB.charAt(j)) {
                    sb.append(stringB.charAt(j++));
                } else {
                    int x = i, y = j;
                    char a = stringA.charAt(i);
                    for(; x < stringA.length() && y < stringB.length(); x++, y++) {
                        if (stringA.charAt(x) != stringB.charAt(y)) {
                            break;
                        } else if (stringA.charAt(x) > a) {
                            sb.append(stringA.substring(i, x)).append(stringB.substring(j, y));
                            i = x; j = y;
                            a = stringA.charAt(x);
                        }
                    }

                    if (x == stringA.length()) {
                        sb.append(stringB.charAt(j));
                        j++;
                    } else if (y == stringB.length()) {
                        sb.append(stringA.charAt(i));
                        i++;
                    } else {
                        if (stringA.charAt(x) < stringB.charAt(y)) {
                            sb.append(stringA.charAt(i));
                            i++;
                        } else {
                            sb.append(stringB.charAt(j));
                            j++;
                        }
                    }
                }
            }

            sb.append(stringA.substring(i)).append(stringB.substring(j));

            System.out.println(sb);
        }
    }
}
