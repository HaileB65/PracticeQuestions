import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        //draft 1 not swapping elements
        int count = 0;
        for(int i=0; i < arr.length; i++) {
            if (arr[i] > sortedArray[i]) {
                arr[i] = sortedArray[i];
                count++;
            }
            if (arr[i] < sortedArray[i]) {
                arr[i] = sortedArray[i];
                count++;
            }
        }

        System.out.println("Final array = " + Arrays.toString(arr));
        System.out.println("Count to sort array = " + count);

        //draft 2 swapping elements
//        int count1 = 0;
//        int tempNumber =0;
//        for(int i=0; i < arr.length; i++) {
//            if (arr[i] > sortedArray[i]) {
//                tempNumber = arr[i];
//                int index = List.of(arr).indexOf(1);
//                System.out.println(index);
//                arr[index] = tempNumber;
//                arr[i] = sortedArray[i];
//                count1++;
//            }
//            if (arr[i] < sortedArray[i]) {
//                arr[i] = sortedArray[i];
//                count++;
//            }
//        }
    }
}
