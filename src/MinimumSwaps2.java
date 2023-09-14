import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwaps2 {

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};

        minimumSwaps(arr);

    }

    private static void minimumSwaps(int[] arr) {
        System.out.println("Original Array = " + Arrays.toString(arr));

        int[] sortedArray = new int[arr.length];
        for(int i=0 ; i < arr.length; i++){
            sortedArray[i] = arr[i];
        }
        Arrays.sort(sortedArray);

        System.out.println("Sorted Array = " + Arrays.toString(sortedArray));

        int count = 0;
        int tempNumber =0;
        for(int i=0; i < arr.length; i++) {
            if (arr[i] > sortedArray[i]) {
                arr[i] = sortedArray[i];
                count++;
                //switch 7 with 2
                tempNumber = arr[i];
//                Arrays.indexOf(arr, 3);
            }
            if (arr[i] < sortedArray[i]) {
                arr[i] = sortedArray[i];
                count++;
            }
        }

        System.out.println("Final array = " + Arrays.toString(arr));
        System.out.println("Count to sort array = " + count);
    }
}
