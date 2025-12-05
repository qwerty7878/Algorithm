import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> x_list = new LinkedList<>();
        List<Integer> y_list = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            isContainDotPos(x, x_list);
            isContainDotPos(y, y_list);
        }
        System.out.println(x_list.get(0) + " " + y_list.get(0));
    }

    private static void isContainDotPos(int dot, List<Integer> list) {
        if (list.contains(dot)) {
            list.remove(Integer.valueOf(dot));
        } else {
            list.add(dot);
        }
    }
}