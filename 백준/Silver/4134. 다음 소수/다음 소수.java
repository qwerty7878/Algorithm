import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            BigInteger prime = new BigInteger(String.valueOf(num));
            //    BigInteger은 String 형태로 숫자를 처리하기 때문
            //    isProbablePrime(10)은 소수인지 판별함 BigInteger과 같이 쓰임
            if (prime.isProbablePrime(10)) {
                sb.append(prime).append("\n");
            } else {
                sb.append(prime.nextProbablePrime()).append("\n");
                //    nextProbablePrime()은 다음 소수를 나타냄
            }
        }
        System.out.println(sb);
    }
}

