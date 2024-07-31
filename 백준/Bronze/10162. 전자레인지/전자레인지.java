import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;
        int c = 0;

        while (true) {
            a += (n / 300);
            n %= 300;
            b += (n / 60);
            n %= 60;
            c += (n / 10);
            if (n % 10 != 0) {
                System.out.println(-1);
                break;
            } else {
                System.out.println(a + " " + b + " " + c);
                break;
            }
        }
    }
}