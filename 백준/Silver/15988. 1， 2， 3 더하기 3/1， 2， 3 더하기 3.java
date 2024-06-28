import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        long dp[] = new long[100_000_001];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(br.readLine());

            for (int j = 3; j <= num; j++) {
                dp[j] = (dp[j - 3] + dp[j - 2] + dp[j - 1]) % 1000000009;
            }

            sb.append(dp[(int) num]).append("\n");
        }
        System.out.println(sb);
    }
}