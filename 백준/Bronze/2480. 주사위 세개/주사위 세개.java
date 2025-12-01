import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> dice = new ArrayList<>();
        dice.add(sc.nextInt());
        dice.add(sc.nextInt());
        dice.add(sc.nextInt());
        Collections.sort(dice);

        Set<Integer> setDice = new HashSet<>(dice);
        if (setDice.size() == 1) {
            System.out.println(10000 + (dice.get(0) * 1000));
        } else if (setDice.size() == 2) {
            System.out.println(1000 + (dice.get(1) * 100));
        } else {
            System.out.println(100 * dice.get(2));
        }
    }
}