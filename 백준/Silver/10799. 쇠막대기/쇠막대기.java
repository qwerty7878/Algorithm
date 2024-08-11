import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String s = br.readLine();

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {   //  ( 인 경우
                stack.push('(');
            } else if (s.charAt(i) == ')') {    //  ) 인 경우
                if (s.charAt(i - 1) == '(') {   //  () 레이저 인경우
                    stack.pop();
                    cnt += stack.size();
                } else {    //  )) 레이저가 아닌경우
                    stack.pop();
                    cnt++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.println(sb.toString());
    }
}
