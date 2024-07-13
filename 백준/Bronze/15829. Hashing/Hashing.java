import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    //  문자열 길이
        String s = br.readLine();   //  문자열

        long sum = 0;
        long r = 1;

        for (int i = 1; i <= n; i++) {
            long num = s.charAt(i - 1) - 'a' + 1;
            sum += (num * r) % 1234567891;
            r = ((r * 31) % 1234567891);
        }

        System.out.println(sum % 1234567891);
    }
}