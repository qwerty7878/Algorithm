import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            for (char c : input.toCharArray()) {
                if (c == '[' || c == '(') {
                    stack.push(c);
                }
                if (stack.isEmpty()) {
                    if (c == ')' || c == ']') {
                        stack.push(c);
                    }
                }
                else {
                    if ((c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[')) {
                        stack.push(c);
                    } else if ((c == ']' && stack.peek() == '[') || (c == ')' && stack.peek() == '(')) {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}