import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a =  Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = findGcd(a, b);
            int lcm = (a * b) / gcd;
            sb.append(lcm).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGcd(b, a % b);
        }
    }
}