import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = st.nextToken();
        String num2 = st.nextToken();

        int rev_num1 = reverseNum(num1);
        int rev_num2 = reverseNum(num2);

        if (rev_num1 > rev_num2) {
            System.out.println(rev_num1);
        } else {
            System.out.println(rev_num2);
        }
    }

    private static int reverseNum(String num) {
        StringBuilder sb = new StringBuilder(num);
        String number = sb.reverse().toString();
        return Integer.parseInt(number);
    }
}