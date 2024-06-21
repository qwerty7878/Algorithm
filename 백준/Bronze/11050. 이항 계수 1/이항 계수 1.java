import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        sb.append(factorial(n) / ((factorial(n - k)) * factorial(k))).append("\n");
        System.out.println(sb);
    }

    static int factorial(int a) {
        if(a == 0)  return 1;
        if(a == 0)  return 1;
        return a * factorial(a - 1);
    }
}