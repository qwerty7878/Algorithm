import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        sb.append(gcd(n, m))
                .append("\n")
                .append(lcm(n, m));

        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        if(b == 0) return a;
        return (a * b) / gcd(a, b);
    }
}