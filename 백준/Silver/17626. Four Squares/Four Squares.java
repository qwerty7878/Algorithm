import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[50001];

        dp[0] = 0;
        dp[1] = 1;

        int min = 0;
        for (int i = 2; i <= n; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - (j * j)]);
                //  12에서 j의 제곱인 1, 4, 9를 빼면 dp[11], dp[8], dp[3]이 나옴
                //  dp[i] = dp[i - 1] + 1이 일반적 점화식이므로 dp[11] + 1이 되고 dp[11]은 3^2 + 1 + 1임
                //  1^1을 더하는 방법의 경우의 수를 만들면 12를 만들기 때문에 + 1을 해주는 것임
                //  dp[8] = 2^2 + 2^2 에 12로 만들려면 4가 부족하므로 2^2인 경우의 수 + 1이 됨
                //  dp[3] = 1 + 1 + 1 에 12로 만들려면 9가 부족하므로 3^2인 경우의 수 + 1이 됨
                //  즉 dp[3]일때 4개, dp[8]일때 3개, dp[11]일때 4개로 최소 3개를 구하는 점화식은 dp[i - j * j] + 1임
            }
            dp[i] = min + 1;
        }
        System.out.println(dp[n]);
    }
}