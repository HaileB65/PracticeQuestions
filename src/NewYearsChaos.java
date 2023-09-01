import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewYearsChaos {

    public static void main(String[] args) {
        int[] array = {2,1,5,3,4};

        findMinimumNumberOfBribes(array);
    }

    public static void findMinimumNumberOfBribes(int[] finalStateOfQueue){
        int totalBribes = 0;
        List<Integer> peopleWhoBribed = new ArrayList<>();

        for (int i=0; i <= finalStateOfQueue.length-1; i++){
            if(finalStateOfQueue[finalStateOfQueue.length-1-i] < finalStateOfQueue.length-i){
                totalBribes += 1;
                peopleWhoBribed.add(finalStateOfQueue.length - i);
            }
        }

        System.out.println(totalBribes);
        System.out.println(peopleWhoBribed);
    }
}
