import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char arr[] = s.toCharArray();

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int n = arr[i] - '0';
            sum += n;
            sb.append(n);
        }

        if (arr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(sb.toString());
        }

    }
}