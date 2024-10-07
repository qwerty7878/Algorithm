import java.util.Scanner;

class Solution {
    static int max;
    static int n,L;
    static int score[];
    static int cal[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            n = sc.nextInt();
            L = sc.nextInt();
            max = 0;

            score = new int[n];
            cal = new int[n];
            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }

            dfs(0,0,0);
            System.out.printf("#%d %d\n", (tc + 1), max);
        }
    }

    static void dfs(int index, int grade, int kcal) {
        if (kcal > L) {
            return;
        }
        if (index == n) {
            max = Math.max(max, grade);
            return;
        }

        dfs(index + 1, grade + score[index], kcal + cal[index]);
        dfs(index + 1, grade, kcal);
    }
}