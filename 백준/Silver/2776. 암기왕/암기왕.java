import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,note[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            n = Integer.parseInt(br.readLine());
            note = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                note[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(note);

            int m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                if (bs(Integer.parseInt(st.nextToken())) == 1) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }

    static int bs(int num) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (note[mid] == num) {
                return 1;
            } else if (note[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}