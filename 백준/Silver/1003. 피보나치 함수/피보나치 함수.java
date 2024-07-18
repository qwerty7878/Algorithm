import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int dp_zero[] = new int[41];
        int dp_one[] = new int[41];

        //  초기값
        dp_one[0] = 0;
        dp_one[1] = 1;
        dp_zero[0] = 1;
        dp_zero[1] = 0;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 2; j <= n; j++) {
                dp_one[j] = dp_one[j - 1] + dp_one[j - 2];
                dp_zero[j] = dp_zero[j - 1] + dp_zero[j - 2];
            }

            sb.append(dp_zero[n] + " " + dp_one[n]).append("\n");
        }
        System.out.println(sb.toString());
    }
}