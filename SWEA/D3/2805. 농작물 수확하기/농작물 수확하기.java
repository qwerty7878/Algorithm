import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();

            int arr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = s.charAt(j) - '0';
                }
            }

            int max = 0;
            int start = n / 2;
            int end = n / 2;

            for (int i = 0; i < n; i++) {
                for (int j = start; j <= end; j++) {
                    max += arr[i][j];
                }

                if (i < n / 2) {
                    start--;
                    end++;
                }
                else {
                    start++;
                    end--;
                }
            }
            System.out.printf("#%d %d\n", (tc + 1), max);
        }
    }
}