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
            total = total + prices.get(i);

            if (total >= 7) {
                numberOfItems = numberOfItems + 1;
                break;
            }
            numberOfItems = numberOfItems + 1;
        }

        System.out.println(total);
        System.out.println(numberOfItems);

        int total2 = 0;
        int numberOfItems2 = 0;
        for (int i = 0; i <= prices.size() - 1; i++) {
            total2 = total2 + prices.get(prices.size() - 1 - i);

            if (total2 == 7) {
                numberOfItems2 = numberOfItems2 + 1;
                continue;
            }
            if (total2 < 7) {
                numberOfItems2 = numberOfItems2 + 1;
            }
        }

        System.out.println();
        System.out.println(total2);
        System.out.println(numberOfItems2);
    }
}
