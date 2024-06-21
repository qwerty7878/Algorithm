import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int except = (int)Math.round(n * 0.15);

        double sum = 0;
        for (int i = except; i < arr.length - except; i++) {
            sum += arr[i];
        }
        sb.append(Math.round(sum / (arr.length - 2 * except))).append("\n");
        System.out.println(sb);
    }
}