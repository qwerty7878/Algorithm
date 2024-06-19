import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            if (command.equals("push")) {
                q.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
            } else if (command.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                sb.append(q.isEmpty() ? -1 : q.peekFirst()).append("\n");
            } else if (command.equals("back")) {
                sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}