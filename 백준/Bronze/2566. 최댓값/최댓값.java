import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .max()
                .getAsInt();

        int index_i = 0;
        int index_j = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == max) {
                    index_i = i + 1;
                    index_j = j + 1;
                    break;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", index_i, index_j);
    }
}