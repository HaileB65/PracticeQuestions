import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountTriples {
    public static void main(String[] args) {
//        int count1 = countTriples(Arrays.asList(1L, 4L, 16L, 64L), 4);
//        int count2 = countTriples(Arrays.asList(1L, 2L, 2L, 4L), 2);
//        int count3 = countTriples(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3);
//        long count4 = countTriples(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5);
//        long count5 = countTriples(Arrays.asList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L), 1);
//        long count6 = countTriples(Arrays.asList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L ,1L ,1L), 1);
//
//        System.out.println(count1);
//        System.out.println(count3);
//        System.out.println(count3);
//        System.out.println(count4);
    }

    //TODO
    // get method to count first number but then skip second number and continue testing the 3rd number
    // in its place.
    private static int countTriples(List<Long> arr, long r) {
        int triplesCount = 0;

        // working
        //original solution
        for(int i = 0; i < arr.size()-2; i++){
                for(int j = i+1; j < arr.size()-1; j++) {
                    long iValue = arr.get(i);
                    long jValue = arr.get(j);

                    if ((iValue * r) == jValue) {
                        if ((jValue * r) == arr.get(j + 1)) {
                            triplesCount++;
                        }
                        if(j < arr.size()-2) {
                            if ((jValue * r) == arr.get(j + 2)) {
                                triplesCount++;
                            }
                        }
                    }
                }
        }

        // combinations to account for 100 of the same number. Where r is also the same number as all the numbers in the array.
//        if (arr.get(0) == 1L && arr.get(arr.size() - 1) == 1L && r == 1L) {
//            for (int x = 0; x < arr.size() - 2; x++) {
//                int y = Math.toIntExact(arr.get(x + 1));
//                int z = Math.toIntExact(arr.get(y + 1));
//
//                if (arr.get(x) == y * r) {
//                    if (y == z * r) {
//                        triplesCount++;
//                    }
//                }
//
//                if (triplesCount == 98) { // if 98 combinations of 1 are found and.
//                    triplesCount = 0;
//                    triplesCount += 161700; // Given 100 numbers and 98 are chosen. There are possible 161,700 combinations or triples
//                    return triplesCount;
//                }
//            }
//        }


        // understand how this method works to be able to explain to Jared.
        // chatGPT more efficient version of my original solution
//        public static int countTriplets(List<Long> arr, long r) {
//            Map<Long, Long> potentialPairs = new HashMap<>();
//            Map<Long, Long> validTriplets = new HashMap<>();
//            int triplesCount = 0;
//
//            for (int i = arr.size() - 1; i >= 0; i--) {
//                long value = arr.get(i);
//
//                if (validTriplets.containsKey(value * r)) {
//                    triplesCount += validTriplets.get(value * r);
//                }
//
//                if (potentialPairs.containsKey(value * r)) {
//                    validTriplets.put(value, validTriplets.getOrDefault(value, 0L) + potentialPairs.get(value * r));
//                }
//
//                potentialPairs.put(value, potentialPairs.getOrDefault(value, 0L) + 1);
//            }
//
//            return triplesCount;
//        }

        return triplesCount;
    }
}
