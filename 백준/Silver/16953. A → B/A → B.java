import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 1;

        while (a != b) {
            if (b % 2 != 0) {
                if (b % 10 == 1) {
                    b = b / 10;
                    cnt++;
                } else {
                    System.out.println(-1);
                    break;
                }
            } else {
                if (b > a) {
                    b = b / 2;
                    cnt++;

                } else {
                    System.out.println(-1);
                    break;
                }
            }
            if (a == b) {
                System.out.println(cnt);
            }
        }

    }
}