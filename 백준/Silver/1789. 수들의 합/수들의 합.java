import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        long sum = 0;
        int i = 1;

        while (true) {
            if(sum > n)    break;
            sum += i;
            i++;
            cnt++;
        }
        System.out.println(cnt -1); //  커졋을때 멈추는 거라 그 전까지만 카운팅
    }
}