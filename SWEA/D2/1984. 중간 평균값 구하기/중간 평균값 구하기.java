import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int arr[] = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            double ans = 0;
            for (int j = 1; j < arr.length - 1; j++) {
                ans += arr[j];
            }
            int res = (int)Math.round(ans / 8);
            System.out.printf("#%d %d\n",(i + 1),res);
        }
    }
}