import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        BigInteger num = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }

        String s = "" + num;
        int cnt = 0;

        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                cnt++;
            }else break;
        }
        sb.append(cnt);
        System.out.println(cnt);
    }
}