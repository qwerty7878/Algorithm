import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);

        input = br.readLine();
        int c = Integer.parseInt(input.split(" ")[0]);
        int d = Integer.parseInt(input.split(" ")[1]);

        long numer = (a * d) + (b * c);
        long denom = b * d;

        long gcd = findGcd(numer, denom);

        sb.append(numer / gcd).append(" ").append(denom / gcd);

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