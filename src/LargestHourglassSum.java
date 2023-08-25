import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestHourglassSum {
    public static void main(String[] args) {

        //ToDO change to List<List<Integer>> arr
        int[][] testCase1 = {
                {-9, -9, -9,  1, 1, 1},
                {0, -9,  0,  4, 3, 2},
                {-9, -9, -9,  1, 2, 3},
                {0,  0,  8,  6, 6, 0},
                {0,  0,  0, -2, 0, 0},
                {0,  0,  1,  2, 4, 0,}
        };

        hourglassSum(testCase1);

    }

    //ToDo enter into chatGPT to see how to refine for loops
    public static int hourglassSum(List<List<Integer>> arr){
        List<Integer> list = new ArrayList<>();
        int hourglass1Sum = 0;

        for (int row = 0; row < arr.size() - 2; row++) {
            for (int column = 0; column < arr.get(0).size() - 2; column++) {
                for (int i = row; i < row+3; i++) {
                    for (int j = column; j < column+3; j++) {
                        if (i == row+1 && j == column) {
                            continue;
                        }
                        if (i == row+1 && j == column+2) {
                            continue;
                        }else {
                            hourglass1Sum = hourglass1Sum + arr.get(i).get(j);
                        }
                    }
                }
                list.add(hourglass1Sum);
                hourglass1Sum = 0;
            }
        }

        list.sort(null);
        return list.get(list.size()-1);
    }

    public void arrayTesting(){
        int[] array1 = {1, 0, 1};
        int total = 0;

        System.out.println();
        System.out.println("array1 = " + Arrays.toString(array1));

        //Finds total of adding indexes together from array1
        for (int i = 0; i <= 2; i++) {
            total = total + array1[i];
        }
        System.out.println("Total of array = " + total);

        System.out.println();
        System.out.println("---------------");
        System.out.println();


        // creates a 2D array
        int[][] arr = new int[3][3];

        //Assigns 1 as index value for every index in 3x3 array
        int rows = 3;
        int columns = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = 1;
            }
        }

        //Prints out 2-D array
        System.out.println("2-D array = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Finds total of 2-D array
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Total of 2-D array = " + sum);

        //Finds total of hourglass shaoe in 2-D array
        int sum2 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 1) {
                    continue;
                }
                if (i == 2 && j == 1) {
                    continue;
                } else {
                    sum2 = sum2 + arr[i][j];
                }
            }
        }
        System.out.println("Total of hourglass shape in 2-D array = " + sum2);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        //Finds total of an hourglass shape in a 6x6 array
        int[][] sixBySixArray = new int[6][6];

        int rows2 = 6;
        int columns2 = 6;
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                sixBySixArray[i][j] = 1; //assings 1 as index value for each index
            }
        }

        System.out.println("6x6 array = ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(sixBySixArray[i][j] + " "); // prints out array
            }
            System.out.println();
        }

        int sum3 = 0;
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                sum3 = sum3 + sixBySixArray[i][j]; //Finds sum to 6x6 array
            }
        }
        System.out.println("Total of 6x6 array = " + sum3);
    }
}
