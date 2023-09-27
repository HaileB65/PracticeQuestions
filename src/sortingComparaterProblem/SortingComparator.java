package sortingComparaterProblem;

import java.util.Comparator;

public class SortingComparator {
    public static void main(String[] args) {
        compare(new Player("Rachel", 50), new Player("Bruce", 100));
    }

    private static int compare(Player a, Player b) {
        return a.score-b.score;
    }
}
