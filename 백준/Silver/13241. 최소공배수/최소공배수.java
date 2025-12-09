import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a =  Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = findGcd(a, b);
        long lcm = (a * b) / gcd;

        sb.append(lcm);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static long findGcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return findGcd(b, a % b);
        }
    }
}