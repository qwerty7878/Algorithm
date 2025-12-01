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
        int v = sc.nextInt();
        int count = (int) list.stream().filter(a -> a == v).count();
        System.out.println(count);
    }
}