import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        int size[] = new int[6];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < size.length; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < size.length; i++) {
            cnt += size[i]/t;
            if (size[i] % t != 0) {
                cnt++;
            }
        }

        sb.append(cnt)
                .append("\n")
                .append((n / p) + " " + (n % p));

        System.out.println(sb);
    }
}