import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int isZero = Integer.parseInt(br.readLine());
            if (isZero == 0) {
                sum -= s.peek();
                s.pop();
            } else {
                s.push(isZero);
                sum += s.peek();
            }
        }
        System.out.println(sum);
    }
}
