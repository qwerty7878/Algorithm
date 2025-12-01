import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        list.stream()
                .filter(a -> a < x)
                .forEach(a -> System.out.print(a + " "));
    }
}