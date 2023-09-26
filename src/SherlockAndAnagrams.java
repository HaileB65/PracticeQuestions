import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        String s = "mom";
        List<String> strings = List.of("abba", "abcd");

        System.out.println(numberOfAnagrammaticPairs(s));

    }

    private static int numberOfAnagrammaticPairs(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>(); // creates hashmap
        int anagramPairCount = 0;

        for (int i = s.length() - 1; i >= 0; i--) { // for loop for length of string
            if (charCount.containsKey(s.charAt(i))) { // if hashmap contains char in string at index 'i'
                int count = charCount.get(s.charAt(i)); // get value(count) of key(char) from hashmap
                charCount.put(s.charAt(i), ++count); // adds key with value of (count) to the hashmap
            } else {
                charCount.put(s.charAt(i), 1); // adds key with value of 1 to hashmap
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            if(value%2 == 0) { // checks to see if char in hashmap has a value divisible by 2.
                anagramPairCount =  anagramPairCount + (value/2); // if so the anagramPairCount is increased by value divided by 2.
            }
        }


        // how can "mo" be rearranged in string "mom" without using the first "m". Yes, as "om".
        System.out.println(s.substring(1)); // prints out "om"
        String subString = s.substring(1);
        // does substring "mo" flipped exist in "mom"?
        String flippedSubString = reverseSubString(subString);
        if (s.contains(flippedSubString)) {
         anagramPairCount++;
        }

        return anagramPairCount;
    }

    private static String reverseSubString(String s){
        String reversedString = "";
        char ch;

        for (int i=0; i<s.length(); i++) {
            ch= s.charAt(i); //extracts each character
            reversedString= ch+reversedString; //adds each character in front of the existing string
        }

        return reversedString;
    }

}