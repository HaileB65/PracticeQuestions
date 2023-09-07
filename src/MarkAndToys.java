import java.util.List;

public class MarkAndToys {
    public static void main(String[] args) {
        findMaximumNumberOfItems();
    }

    private static void findMaximumNumberOfItems() {
        //example 1
//        List<Integer> prices = List.of(1, 2, 3, 4);
//        int k = 7;

        //example 2
        List<Integer> prices = List.of(1, 12, 5, 111, 200, 1000, 10);
        int k = 50;

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

        int total2=0;
        int numberOfItems2 = 0;

        for (int i = prices.size() - 1; i >= 0 ; i--) {
            if(total2 == k){
                break;
            }

            if((total2 + prices.get(i)) > k){
                break;
            }

            total2 = total2 + prices.get(i);
            numberOfItems2 = numberOfItems2 + 1;
        }

        System.out.println(Math.max(numberOfItems, numberOfItems2));
    }
}
