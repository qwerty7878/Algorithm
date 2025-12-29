import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[n];
        dp[0] = arr[0];
        int sum = dp[0];
        
        for (int i = 1; i < n; i++) {
//            kadane 알고리즘
//            dp[i] = max(dp[i - 1] + ai, ai)
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            sum = Math.max(sum, dp[i]);
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}