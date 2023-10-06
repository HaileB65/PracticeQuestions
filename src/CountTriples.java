import java.util.Arrays;
import java.util.List;

public class CountTriples {
    public static void main(String[] args) {
//        int count = countTriples(Arrays.asList(1, 4, 16, 64), 4);
//        int count2 = countTriples(Arrays.asList(1, 2, 2, 4), 2);
//        int count3 = countTriples(Arrays.asList(1, 3, 9, 9, 27, 81), 3);
//        long count4 = countTriples(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5);
//        long count5 = countTriples(Arrays.asList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L), 1);
        long count6 = countTriples(Arrays.asList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L ,1L ,1L), 1);
        System.out.println(count6);
    }

    //TODO
    // get method to count first number but then skip second number and continue testing the 3rd number
    // in its place.
    private static int countTriples(List<Long> arr, long r) {
        int triplesCount = 0;

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
        return triplesCount;
    }
}
