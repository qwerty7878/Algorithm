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

        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                dq.addFirst(x);
            } else if (command == 2) {
                int x = Integer.parseInt(st.nextToken());
                dq.addLast(x);
            } else if (command == 3) {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pollFirst()).append("\n");
                }
            } else if (command == 4) {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pollLast()).append("\n");
                }
            } else if (command == 5) {
                sb.append(dq.size()).append("\n");
            } else if (command == 6) {
                if (dq.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }else if (command == 7){
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.peekFirst()).append("\n");
                }
            }else if (command == 8){
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.peekLast()).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}