import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int floor = -1;
        int room = -1;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int cu = Integer.parseInt(st.nextToken());

            if (cu % h == 0) {
                floor = h * 100;
                room = cu / h;
            } else {
                floor = (cu % h) * 100;
                room = (cu / h) + 1;
            }
            sb.append(floor + room).append("\n");
        }
        System.out.print(sb);
    }
}