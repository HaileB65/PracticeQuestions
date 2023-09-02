import java.util.ArrayList;
import java.util.List;

public class NewYearsChaos {

    public static void main(String[] args) {
        List<Integer> array = List.of(2,1,5,3,4);
        List<Integer> array2 = List.of(1, 2, 5, 3, 7, 8, 6, 4);

        findMinimumNumberOfBribes(array2);

    }

    public static void findMinimumNumberOfBribes(List<Integer> q){
        int totalBribes = 0;

        for (int i=0; i <= q.size()-1; i++){
            int actualNumber = q.get(q.size() - 1 - i);
            int expectedNumber = q.size()-i;

//            if(q.get(i) > q.get(i)){
//                totalBribes += totalBribes + 1;
//            }

            if(actualNumber > expectedNumber){
                int bribes = actualNumber-expectedNumber;
                totalBribes += (actualNumber - expectedNumber);

                if(bribes > 2){
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }

        System.out.println(totalBribes);
    }
}
