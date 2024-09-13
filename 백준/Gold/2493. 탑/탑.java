import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<int []> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int h = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if (stack.peek()[1] >= h) {
                    sb.append(stack.peek()[0] + " ");
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append(stack.size() + " ");
            }
            stack.push(new int[]{i, h});
        }
        System.out.println(sb.toString());
    }
}