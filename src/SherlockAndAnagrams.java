import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        String s = "mom";
        List<String> strings = List.of("abba", "abcd");

        numberOfAnagrammaticPairs(s);

    }

    private static int numberOfAnagrammaticPairs(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (charCount.containsKey(s.charAt(i))) {
                int count = charCount.get(s.charAt(i));
                charCount.put(s.charAt(i), ++count);
            } else {
                charCount.put(s.charAt(i), 1);
            }
        }
        System.out.println(charCount);

        return 0;
    }
}
