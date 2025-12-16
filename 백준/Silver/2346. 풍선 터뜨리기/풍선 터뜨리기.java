import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<int []> ballon = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ballon.add(new int[]{(i + 1), Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();
        while (!ballon.isEmpty()) {
            int[] ball = ballon.pollFirst();
            int idx = ball[0];
            int num = ball[1];

            sb.append(idx).append(" ");

            if (ballon.isEmpty()) {
                break;
            }

            if (num > 0) {
                for (int i = 0; i < num - 1; i++) {
                    ballon.addLast(ballon.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(num); i++) {
                    ballon.addFirst(ballon.pollLast());
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}