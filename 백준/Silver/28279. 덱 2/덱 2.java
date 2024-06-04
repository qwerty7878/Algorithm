import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (command == 2) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (command == 3) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            } else if (command == 4) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            } else if (command == 5) {
                sb.append(dq.size()).append("\n");
            } else if (command == 6) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            } else if (command == 7) {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
            } else if (command == 8) {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}

