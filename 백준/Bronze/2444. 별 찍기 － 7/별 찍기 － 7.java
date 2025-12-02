import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(n - (i + 1)) + "*".repeat(2 * (i + 1) - 1));
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println(" ".repeat((i + 1)) + "*".repeat(2 * (n - (i + 1)) - 1));
        }
    }
}