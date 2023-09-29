import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTriples {
    public static void main(String[] args) {
        int count = countTriples(Arrays.asList(1, 4, 16, 64), 4);
        int count2 = countTriples(Arrays.asList(1, 2, 2, 4), 2);

        System.out.println(count2);
    }

    //TODO
    // get method to count first number but then skip second number and continue testing the 3rd number
    // in its place.
    private static int countTriples(List<Integer> arr, long r) {
        int triplesCount = 0;

        for(int i = 0; i < arr.size()-2; i++){
            for(int j = i+1; j < arr.size()-2; j++) {
                if (arr.get(j) == (arr.get(i) * r)) {
                    if (arr.get(j + 1) == (arr.get(j) * r)) {
                        triplesCount++;
                    }
                }
            }
        }

//        if (arr.get(1) == (arr.get(0) * r) && arr.get(2) == (arr.get(1) * r)) {
//            triplesCount++;
//        }
//
//        if (arr.get(2) == (arr.get(1) * r) && arr.get(3) == (arr.get(2) * r)) {
//            triplesCount++;
//        }

        return triplesCount;
    }
}
