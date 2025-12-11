import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 5) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                }else  {
                    sb.append(0).append("\n");
                }
            }else if (command == 3) {
                sb.append(stack.size()).append("\n");
            }else if (command == 2) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                }else  {
                    sb.append(-1).append("\n");
                }
            }else if (command == 1) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}