import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    //  문자열 길이
        String s = br.readLine();   //  문자열
        char carr[] = new char[n];

        for (int i = 0; i < n; i++) {
            carr[i] = s.charAt(i);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            long num = carr[i] - 'a' + 1;
            sum += (long) Math.pow(31,i) * num;
        }

        System.out.println(sum % 1234567891);
    }
}