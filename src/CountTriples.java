import java.util.Arrays;
import java.util.List;

public class CountTriples {
    public static void main(String[] args) {
//        int count = countTriples(Arrays.asList(1, 4, 16, 64), 4);
        int count2 = countTriples(Arrays.asList(1, 2, 2, 4), 2);

        System.out.println(count2);
    }

    //TODO
    // get method to count first number but then skip second number and continue testing the 3rd number
    // in its place.
    private static int countTriples(List<Integer> arr, long r) {
        int triplesCount = 0;

        // 1, 2, 2, 4
        for(int i = 0; i < arr.size()-2; i++){
            if((arr.get(i)*r) == (arr.get(i+1))){
                for(int j = i+1; j < arr.size()-2; j++) {
                    if ((arr.get(i) * r) == arr.get(j)) { // if( i*r == j )
                        if ((arr.get(j) * r) == arr.get(j + 1)) { // if ( j*r == j+1 )
                            triplesCount++;
                        }
                        if ((arr.get(j) * r) == arr.get(j + 2)) { // if( j*r == j+2 )
                            triplesCount++;
                        }
                    }
                }
            }
            if((arr.get(i)*r) == (arr.get(i+1))){

            }
        }
        return triplesCount;
    }
}
