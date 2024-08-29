import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int number = n;
        int cnt = 1;

         do {
            int first = number % 10;
            int second = number / 10;
            int sum = (first + second) % 10;
            
            number = first * 10 + sum;

            if (n == number) {
                break;
            } else {
                cnt++;
            }
        }while (true);

        System.out.println(cnt);
    }
}