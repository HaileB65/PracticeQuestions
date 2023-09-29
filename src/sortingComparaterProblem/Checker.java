package sortingComparaterProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
class Checker implements Comparator<Player> {
    public static void main(String[] args) {
        Player[] players = {
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150)};

        Player[] players2 = {
                new Player("Smith", 20),
                new Player("Jones", 15),
                new Player("Jones", 20)};
        System.out.println(Arrays.deepToString(players2));

        Checker checker = new Checker();

        Arrays.sort(players2, checker);
        System.out.println(Arrays.deepToString(players2));
        //TODO
        //Get compare method to sort players array correctly. Score first name second.
    }

    // -1 means a < b
    // 0 means a == b
    // 1 means a > b
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        } else if (a.score == b.score) {
            int value = a.name.compareTo(b.name);

            if (value < 0) {
                return -1; // a.name comes first
            }
            if (value > 0) {
                return 1; // b.name comes first
            } else {
                return 0; // a.name and b.name are the same
            }
        }

        return -1; // means b.score is greater that a.score
    }
}
