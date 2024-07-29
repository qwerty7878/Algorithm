import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int coin = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;
        while (true) {
            cnt += coin / 500;
            coin %= 500;
            cnt += coin / 100;
            coin %= 100;
            cnt += coin / 50;
            coin %= 50;
            cnt += coin / 10;
            coin %= 10;
            cnt += coin / 5;
            coin %= 5;
            cnt += coin;
            break;
        }
        System.out.println(cnt);
    }
}