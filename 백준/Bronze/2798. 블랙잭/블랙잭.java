import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cards[] = new int[n];
        for (int i = 0; i < n; i++) {
            int card = sc.nextInt();
            cards[i] = card;
        }
        Arrays.sort(cards);

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (cards[i] + cards[j] + cards[k] <= m) {
                        if (max < cards[i] + cards[j] + cards[k]) {
                            max = cards[i] + cards[j] + cards[k];
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}