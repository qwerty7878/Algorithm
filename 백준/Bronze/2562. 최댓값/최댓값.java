import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        int max = list.stream().max(Integer::compareTo).get();
        int index = list.indexOf(max);
        System.out.printf("%d\n",max);
        System.out.printf("%d\n",index + 1);
    }
}