import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push")) {
                q.offer(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.poll()).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (s.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("front")) {
                if (q.peek() == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peek()).append("\n");
                }
            } else if (s.equals("back")) {
                if (q.peekLast() == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}

