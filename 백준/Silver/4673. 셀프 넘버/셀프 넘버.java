import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean check[] = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int num = d(i);

            if (num < 10001) {
                check[num] = true;
            }
        }
        
        for (int i = 1; i < 10001; i++) {

            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    static int d(int n) {

        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}