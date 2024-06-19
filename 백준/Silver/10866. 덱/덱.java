import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            if (command.equals("push_front")) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (command.equals("push_back")) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop_front")) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            } else if (command.equals("pop_back")) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            } else if (command.equals("size")) {
                sb.append(dq.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
            } else if (command.equals("back")) {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}