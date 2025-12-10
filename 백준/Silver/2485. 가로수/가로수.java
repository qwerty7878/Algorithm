import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int arr[] = new int [t];

        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 1; i < t; i++) {
            int temp = arr[i] - arr[i - 1];
            gcd = findGcd(temp, gcd);
        }

        int count = 0;
        for (int i = 0; i < t - 1; i++) {
            if (arr[i] + gcd == arr[i + 1]) {
                continue;
            } else {
                int num = arr[i];
                while (true) {
                    if (num + gcd == arr[i + 1]) {
                        break;
                    }
                    num += gcd;
                    count++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGcd(b, a % b);
        }
    }
}