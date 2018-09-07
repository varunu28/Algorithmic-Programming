public class StrStrImplementation {

    public int strstr(String str, String target) {

        for (int i=0; i<=str.length()-target.length(); i++) {
            if (str.substring(i, i+target.length()).equals(target)) {
                return i;
            }
        }

        return -1;
    }
}

