import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSwaps2 {

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        int[] arr2 = {4, 3, 1, 2};
        int[] arr3 = {2, 3, 4, 1, 5};
        int[] arr4 = {1, 3, 5, 2, 4, 6, 7};

//        int minSwaps = minimumSwaps(arr);

//        int minSwaps2 = bubbleBubbleCount(arr);

        int minSwaps3 = bubbleBubbleCount2(arr);
        System.out.println(minSwaps3);

        minSwaps3 = bubbleBubbleCount2(arr2);
        System.out.println(minSwaps3);

        minSwaps3 = bubbleBubbleCount2(arr3);
        System.out.println(minSwaps3);

        minSwaps3 = bubbleBubbleCount2(arr4);
        System.out.println(minSwaps3);
    }

    private static int minimumSwaps(int[] arr) {
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
        int count1 = 0;
        int tempNumber =0;
        for(int i=0; i < arr.length; i++) {
            if (arr[i] > sortedArray[i]) {
                tempNumber = arr[i];
                int index = List.of(arr).indexOf(1);
                System.out.println(index);
                arr[index] = tempNumber;
                arr[i] = sortedArray[i];
                count1++;
            }
            if (arr[i] < sortedArray[i]) {
                arr[i] = sortedArray[i];
                count++;
            }
        }
        return count;
    }

    // {7, 1, 3, 2, 4, 5, 6}
    private static int bubbleBubbleCount(int[] arr){
        int tempNumber = 0;
        int swapCount = 0;

        for(int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tempNumber = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempNumber;
                    swapCount++;
                }
            }
        }

        return 0;
    }

    private static int bubbleBubbleCount2(int[] arr){
        int tempNumber = 0;
        int swapCount = 0;


        if(arr[0] > arr[arr.length/2]){
            tempNumber = arr[0];
            arr[0] = arr[arr.length/2];
            arr[arr.length/2] = tempNumber;
            swapCount++;
        }

        for(int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tempNumber = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempNumber;
                    swapCount++;
                }
            }
        }

        return swapCount;
    }
}
