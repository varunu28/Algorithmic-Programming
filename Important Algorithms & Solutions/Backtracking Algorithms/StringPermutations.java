public class StringPermutations {

    public static void main (String... args) {

        String str = "ABCD";
        permutehelper(str, "");
    }

    public static void permutehelper(String s, String chosen) {
        if (s.isEmpty()) {
            System.out.println(chosen);
        }

        else {
            // choose/explore/unchoose
            
			for (int i=0;i<s.length();i++) {

                // Choose
                char c = s.charAt(i);
                chosen += c;
                s = removeChar(s, i);

                // Explore
                permutehelper(s, chosen);

                // Unchoose
                s = addChar(s, c, i);
                chosen = removeChar(chosen, chosen.length()-1);

            }
        }
    }

    public static String removeChar(String s, int id) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(id);

        return sb.toString();
    }

    public static String addChar(String s, char c, int id) {
        StringBuilder sb = new StringBuilder(s);
        sb.insert(id, c);

        return sb.toString();
    }
}
