import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(br.readLine());

            while (true) {
                if (isPrime(num)) {
                    break;
                }
                num++;
            }
            sb.append(num).append("\n");
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