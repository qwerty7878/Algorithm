import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }

            int sum = list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            if (sum != n) {
                System.out.printf("%d is NOT perfect.\n", n);
            } else {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == list.get(list.size() - 1)) {
                        System.out.println(list.get(i));
                    } else {
                        System.out.print(list.get(i) + " + ");
                    }
                }
            }
        }
    }
}