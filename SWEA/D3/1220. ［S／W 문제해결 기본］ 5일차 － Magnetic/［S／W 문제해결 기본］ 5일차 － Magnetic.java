import java.util.Scanner;

class Solution {
    static int n, k;
    static int arr[];
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int t = sc.nextInt();

            int lock = 0;
            int arr[][] = new int[100][100];
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 100; i++) {
                boolean flag = false;
                for (int j = 0; j < 100; j++) {
                    if (arr[j][i] == 1) {
                        flag = true;
                    } else if (arr[j][i] == 2 && flag) {
                        lock++;
                        flag = false;
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, lock);
        }
    }
}
