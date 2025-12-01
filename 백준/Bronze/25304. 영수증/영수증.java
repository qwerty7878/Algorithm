import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int t = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < t; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            int total = price * count;
            sum += total;
        }

        if (sum == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}