import java.util.Scanner;

public class Solution {
    static int arr[][];
    static boolean visited[];
    static int max;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            N = n;

            arr = new int[n + 1][n + 1];
            visited = new boolean[n + 1];
            max = Integer.MIN_VALUE;

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y] = arr[y][x] = 1;
            }

            for (int i = 1; i < n + 1; i++) {
                dfs(1,i);
                visited[i] = false;
            }
            System.out.printf("#%d %d\n",test,max);
        }
    }

    static void dfs(int a, int b) {
        visited[b] = true;

        for (int i = 1; i <= N; i++) {
            if (arr[b][i] == 1 && !visited[i]) {
                dfs(a + 1,i);
                visited[i] = false;
            }
        }
        max = Math.max(a, max);
    }
}
