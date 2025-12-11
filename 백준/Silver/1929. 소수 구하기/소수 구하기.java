import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            for (long i = 3; i <= Math.sqrt(num); i += 2) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}