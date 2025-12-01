import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        int max = list.stream().max(Integer::compareTo).get();
        double sum = list.stream()
                .mapToDouble(a -> a * 100.0 / max)
                .sum();
        double average = sum / n;
        System.out.printf("%f", average);
    }
}