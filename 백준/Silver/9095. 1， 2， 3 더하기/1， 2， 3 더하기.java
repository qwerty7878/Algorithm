import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int dp[] = new int[10001];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            for (int j = 3; j <= num; j++) {
                dp[j] = dp[j - 2] + dp[j - 1] + dp[j - 3];
            }
            System.out.println(dp[num]);
        }
    }
}