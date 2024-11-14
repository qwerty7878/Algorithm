import java.util.Scanner;

class Solution {
    static int n, k;
    static int arr[];
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            cnt = 0;
            algo(0, 0);

            System.out.printf("#%d %d\n", tc, cnt);
        }
    }

    static void algo(int start, int sum) {
        if (sum > k) {
            return;
        }
        if (start == arr.length) {
            if (sum == k) {
                cnt++;
            }
            return;
        }

        algo(start + 1, sum + arr[start]);
        algo(start + 1, sum);
    }
}
