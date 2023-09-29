import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        String a = "mom";
        String b ="abba";
        String c = "abcd";

        System.out.println(numberOfAnagrammaticPairs(a));
        System.out.println(numberOfAnagrammaticPairs(b));


    }

    private static int numberOfAnagrammaticPairs(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>(); // creates hashmap
        int anagramPairCount = 0;

//        for (int i = s.length() - 1; i >= 0; i--) { // for loop for length of string
//            if (charCount.containsKey(s.charAt(i))) { // if hashmap contains char in string at index 'i'
//                int count = charCount.get(s.charAt(i)); // get the count of letter in string
//                charCount.put(s.charAt(i), ++count); // adds char(key) with count(value) to the hashmap
//            } else {
//                charCount.put(s.charAt(i), 1); // adds char with count of 1 to hashmap
//            }
//        }

//        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) { // iterates over hashmap
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//
//            if(value%2 == 0) { // checks to see if char in hashmap has a value divisible by 2.
//                anagramPairCount =  anagramPairCount + (value/2); // if so the anagramPairCount is increased by value divided by 2.
//            }
//        }

        //TODO
        // break down "ba" string into count "b" by itself
        System.out.println();
        for(int i = 1; i < s.length(); i++) {
            String subString = s.substring(i);
            StringBuilder sb = new StringBuilder(subString);
            sb.reverse();
            String flippedSubString = sb.toString();
            if (s.contains(flippedSubString)) {
                anagramPairCount++;
            }

        }

        return anagramPairCount;
    }

    private static String reverseSubString(String s){
        String reversedString = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch= s.charAt(i); //extracts each character
            reversedString= ch+reversedString; //adds each character in front of the existing string
        }

        return reversedString;
    }

}