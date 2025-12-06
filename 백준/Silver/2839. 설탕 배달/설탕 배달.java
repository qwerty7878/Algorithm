import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bag = 0;
        while (true) {
            if (n % 5 == 0) {
                bag += n / 5;
                System.out.println(bag);
                break;
            } else if (n < 3) {
                System.out.println(-1);
                break;
            }
            n -= 3;
            bag++;
        }
    }
}