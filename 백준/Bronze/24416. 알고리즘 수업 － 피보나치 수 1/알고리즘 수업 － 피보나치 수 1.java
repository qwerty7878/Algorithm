import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int dp[];

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         n = Integer.parseInt(br.readLine());
         dp = new int[n+1];
         int recursiveCount = fib(n);
         int dpCount = fibonnacci(n);
        System.out.printf("%d %d", recursiveCount, dpCount);
    }

    private static int fibonnacci(int n) {
        int count = 1;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n; i++) {
            count++;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return count;
    }

    private static int fib(int n) {
        int count = 0;
        if (n == 1 || n == 2) {
            count++;
        } else {
            return fib(n-1) + fib(n - 2);
        }
        return count;
    }
}