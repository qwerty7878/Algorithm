import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int cnt = 0;
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nqueen(0);
        System.out.println(cnt);
    }

    static void nqueen(int depth) {
        if (n == depth) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (isPossible(depth)) {
                nqueen(depth + 1);
            }
        }
    }

    static boolean isPossible(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[depth] == arr[i]) {
                return false;
            } else if (Math.abs(arr[depth] - arr[i]) == Math.abs(depth - i)) {
                return false;
            }
        }
        return true;
    }
}