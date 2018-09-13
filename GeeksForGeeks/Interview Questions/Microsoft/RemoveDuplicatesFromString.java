import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

    public String removeDuplicates(String s) {
        char[] charArray = s.toCharArray();
        Set<Character> set = new TreeSet<>();

        for (char c : charArray) {
            set.add(c);
        }

        return set.
                stream().
                map(String::valueOf).
                collect(Collectors.joining());
    }
}

