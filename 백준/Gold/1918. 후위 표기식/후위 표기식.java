import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append(s.charAt(i));
            } else {
                if (s.charAt(i) == '(') {
                    st.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        sb.append(st.pop());
                    }
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                } else {
                    while (!st.isEmpty() && priority(st.peek()) >= priority(s.charAt(i))) {
                        sb.append(st.pop());
                    }
                    st.push(s.charAt(i));
                }
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
    }

    static int priority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}