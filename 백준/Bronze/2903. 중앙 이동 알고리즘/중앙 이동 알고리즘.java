import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dot[] = new int[n + 1];
        dot[0] = 4;

        for (int i = 1; i <= n; i++) {
            dot[i] = (int) Math.pow((2 * (Math.sqrt(dot[i - 1])) - 1), 2);
        }
        System.out.println(dot[n]);
    }
}