import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int arr[];
    static int n,m, k;
    static int cnt;
    static int fish;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }
            Arrays.sort(arr);
            isMake(a);
        }
    }

    static void isMake(int a) {
        for (int i = 0; i < arr.length; i++) {
            fish = arr[i] / m * k;

            if (fish - i - 1 < 0) {
                System.out.println("#" + a + " Impossible");
                return;
            }
        }
        System.out.println("#" + a + " Possible");
    }
}
