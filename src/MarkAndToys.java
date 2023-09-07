import java.util.List;

public class MarkAndToys {
    public static void main(String[] args) {
        findMaximumNumberOfItems();
    }

    private static void findMaximumNumberOfItems() {
        List<Integer> prices = List.of(1, 2, 3, 4);
        int k = 7;
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

        System.out.println(total);
        System.out.println(numberOfItems);
    }
}
