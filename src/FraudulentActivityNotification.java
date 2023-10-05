import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FraudulentActivityNotification {
    public static void main(String[] args) {
        List<Integer> expenses = Arrays.asList(10, 20, 30, 40, 50);
        int trailingDays = 3;

        activityNotifications(expenses, trailingDays);
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int numberOfNotifications = 0;
        List<Integer> trailingDaysExpenses = new ArrayList<>();

        for(int i = 0; i < d; i++){
            trailingDaysExpenses.add(expenditure.get(i));
        }
        trailingDaysExpenses.sort(null);
        if(trailingDaysExpenses.size()%2 == 0) {
//            findMean(trailingDaysExpenses, trailingDaysExpenses.size());
        }

        //TODO
        //get find mean method to work.


        return numberOfNotifications;
    }

    public static double findMean(int trailingDays[], int arrayLength)
    {
        int sum = 0;
        for (int i = 0; i < arrayLength; i++)
            sum += trailingDays[i];

        return (double)sum / (double)arrayLength;
    }

    public static double findMedian(int trailingDays[], int arrayLength)
    {
        Arrays.sort(trailingDays);

        if (arrayLength % 2 != 0)
            return (double)trailingDays[arrayLength / 2];

        return (double)(trailingDays[(arrayLength - 1) / 2] + trailingDays[arrayLength / 2]) / 2.0;
    }

}
