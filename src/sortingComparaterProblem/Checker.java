package sortingComparaterProblem;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    public static void main(String[] args) {
        Checker checker = new Checker();
        int value = checker.compare(new Player("Rachel", 50), new Player("Bruce", 100));

        System.out.println(value);
    }

    // complete this method
    public int compare(Player a, Player b) {

        return a.score-b.score;
    }

}
