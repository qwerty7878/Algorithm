import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> current_waiting_line = new LinkedList<>();
        Stack<Integer> temp_waitting_line = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            current_waiting_line.add(Integer.parseInt(st.nextToken()));
        }

        int current_waiting_num = 1;
        while (!current_waiting_line.isEmpty()) {
            int current_num = current_waiting_line.poll();
            if (current_num == current_waiting_num) {
                current_waiting_num++;
            } else {
                temp_waitting_line.push(current_num);
            }

            while (!temp_waitting_line.isEmpty()) {
                if (temp_waitting_line.peek() == current_waiting_num) {
                    temp_waitting_line.pop();
                    current_waiting_num++;
                } else {
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (current_waiting_num == n + 1) {
            sb.append("Nice").append("\n");
        } else {
            sb.append("Sad").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}