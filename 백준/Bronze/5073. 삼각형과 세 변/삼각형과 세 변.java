import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            List<Integer> angles = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                int angle = sc.nextInt();
                angles.add(angle);
            }

            if (angles.get(0) == 0 && angles.get(1) == 0 && angles.get(2) == 0) {
                break;
            }

            int max = angles.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .getAsInt();

            int sum = angles.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            int restTwoLine = sum - max;
            Set<Integer> set = new HashSet<>(angles);

            if (restTwoLine > max) {
                if (set.size() == 1) {
                    System.out.println("Equilateral");
                } else if (set.size() == 2) {
                    System.out.println("Isosceles");
                } else if (set.size() == 3) {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}