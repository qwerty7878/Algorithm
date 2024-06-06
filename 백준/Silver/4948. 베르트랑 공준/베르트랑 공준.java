import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0)  break;

            boolean isPrime[] = new boolean[(2*n) + 1];
            Arrays.fill(isPrime,true);  //  일단 전체 true

            isPrime[0] = isPrime[1] = false;    //  0 1 은 소수 아니니까 false

            for (int i = 2; i <= (int) (Math.sqrt(2*n) + 1); i++) { //  소수 판별
                if (isPrime[i]) {   // 현재 isPrime에 true인 애들 중
                    for (int j = i * i; j <= 2*n; j += i) { // 소수가 아닌것들 false로 바꿔줌
                        isPrime[j] = false;
                    }
                }   //  isPrime안에 true는 소수밖에없음
            }
            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {  //  n보다 크고 2n 보다 작거나 같은
                if (isPrime[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}