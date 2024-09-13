import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        boolean isClose = false;

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                isClose = true; //  괄호 표시
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(s.charAt(i)); //  < 추가
            } else if (s.charAt(i) == '>') {
                isClose = false;    //  괄호 끝
                sb.append(s.charAt(i)); //  > 추가
            } else if (isClose == true) {
                sb.append(s.charAt(i)); //  괄호 안 내용은 그대로 출력
            } else if (isClose == false) {
                if (s.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(s.charAt(i));
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}