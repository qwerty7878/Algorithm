import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int coin = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (coin > 0) {
            if (coin % 5 == 0) {
                cnt += coin / 5;
                break;
            } else {
                coin -= 2;
                cnt++;
            }
        }
        if (coin < 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}