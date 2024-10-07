import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int t = sc.nextInt();
            int arr[][] = new int[100][100];

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < 100; i++) {
                int rSum = 0;
                int cSum = 0;

                for (int j = 0; j < 100; j++) {
                    rSum += arr[i][j];
                    cSum += arr[j][i];
                }

                max = Math.max(max, Math.max(rSum, cSum));
            }

            int lcSum = 0;
            int rcSum = 0;
            for (int i = 0; i < 100; i++) {
                lcSum += arr[i][i];
                rcSum += arr[99 - i][99 - i];
            }

            max = Math.max(max, Math.max(lcSum, rcSum));
            System.out.printf("#%d %d\n", tc, max);
        }
    }
}