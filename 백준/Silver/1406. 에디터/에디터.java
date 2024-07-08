import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();   //  초기 문자열
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        // 커서 위치를 left | right 라고 생각

        for (int i = 0; i < s.length(); i++) {  //  초기 문자열 입력
            left.push(s.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());    //  반복 횟수

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);  //  문자열 첫글자

            if (c == 'L') {
                if (!left.isEmpty()) {  // 커서가 맨 앞에 가면 무시한다 = 스택이 비어있다면
                    right.push(left.pop());
                }
            } else if (c == 'D') {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if (c == 'B') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (c == 'P') {
                left.push(st.nextToken().charAt(0));
            }
        }

        while (!left.isEmpty()) {   //  끝날땐 커서 맨 앞으로 보내줘야하니까 left비우고 right으로 채워줌
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {  //  right 스택 출력
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}