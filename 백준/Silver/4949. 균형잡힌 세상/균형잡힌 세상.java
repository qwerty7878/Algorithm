import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            if(s.equals("."))   break;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                }
                if (s.charAt(i) == ')') {
                    if (stack.empty()) {
                        stack.push(s.charAt(i));
                        break;
                    } else if(stack.peek() == '('){
                        stack.pop();
                    }else break;
                }
                else if (s.charAt(i) == ']') {
                    if (stack.empty()) {
                        stack.push(s.charAt(i));
                        break;
                    } else if(stack.peek() == '['){
                        stack.pop();
                    }else break;
                }
            }
            if (stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
