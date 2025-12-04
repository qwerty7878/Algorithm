import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paper[][] = new int[100][100];

        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int sum = Arrays.stream(paper).flatMapToInt(Arrays::stream).sum();
        System.out.println(sum);
    }
}