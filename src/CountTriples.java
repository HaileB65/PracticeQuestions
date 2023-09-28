import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTriples {
    public static void main(String[] args) {
        int count = countTriples(Arrays.asList(1, 4, 16, 64), 4);

        System.out.println(count);
    }

    private static int countTriples(List<Integer> arr, long r) {
        int triplesCount = 0;


        if (arr.get(1) == (arr.get(0) * r) && arr.get(2) == (arr.get(1) * r)) {
            triplesCount++;
        }

        if (arr.get(2) == (arr.get(1) * r) && arr.get(3) == (arr.get(2) * r)) {
            triplesCount++;
        }

        return triplesCount;
    }
}
