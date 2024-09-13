import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<int[]> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int move = arr[0];
        sb.append("1 ");

        for (int i = 1; i < n; i++) {
            dq.add(new int[]{(i + 1), arr[i]});
        }

        while (!dq.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    dq.addLast(dq.pollFirst());
                }

                int next[] = dq.poll();
                move = next[1];
                sb.append(next[0] + " ");
            } else {
                for (int i = 1; i < -move; i++) {
                    dq.addFirst(dq.pollLast());
                }

                int next[] = dq.pollLast();
                move = next[1];
                sb.append(next[0] + " ");
            }
        }
        System.out.println(sb.toString());
    }
}