import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int zero_one_cnt = 0;
        int one_zero_cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {   //   0인경우
                if (s.charAt(i) != s.charAt(i + 1)) { // 0 1 경우
                    zero_one_cnt++;
                } else {
                    continue;
                }
            } else {    //  1 인경우
                if (s.charAt(i) != s.charAt(i + 1)) {   //  1 0 경우
                    one_zero_cnt++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(Math.max(one_zero_cnt,zero_one_cnt));
    }
}