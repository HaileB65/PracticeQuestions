import java.util.ArrayList;
import java.util.List;

public class MarkAndToys {
    public static void main(String[] args) {
        //example 1
//        List<Integer> prices = List.of(1, 2, 3, 4);
//        int k = 7;

        //example 2
        List<Integer> prices = new ArrayList<>(List.of(1, 12, 5, 111, 200, 1000, 10));
        int k = 50;

        findMaximumNumberOfItems(prices, k);
    }

    private static int findMaximumNumberOfItems(List<Integer> prices, int k) {
        prices.sort(null);

        int numberOfItems = 0;
        int total = 0;

        for (int i = 0; i <= prices.size() - 1; i++) {
            if(total == k){
                break;
            }

            if((total + prices.get(i)) > k){
                break;
            }

            total = total + prices.get(i);
            numberOfItems = numberOfItems + 1;
        }

        return numberOfItems;
    }
}
