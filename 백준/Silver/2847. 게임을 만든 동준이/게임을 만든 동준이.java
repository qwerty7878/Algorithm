import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            while (arr[i] <= arr[i - 1]) {
                arr[i - 1]--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}