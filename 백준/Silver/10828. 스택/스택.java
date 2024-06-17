import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String com = st.nextToken();

            if (com.equals("push")) {
                s.push(Integer.parseInt(st.nextToken()));
            } else if (com.equals("pop")) {
                sb.append(s.isEmpty() ? -1 : s.pop()).append("\n");
            } else if (com.equals("size")) {
                sb.append(s.size()).append("\n");
            } else if (com.equals("empty")) {
                sb.append(s.isEmpty() ? 1 : 0).append("\n");
            } else if (com.equals("top")) {
                sb.append(s.isEmpty() ? -1 : s.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}