import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            boolean isPrime = true;
            if (i == 2) {
                list.add(i);
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (isPrime && i == j + 1) {
                    list.add(i);
                }
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else  {
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();

            System.out.println(sum);
            System.out.println(min);
        }
    }
}