import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int start = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > start) {  
                //  오름차순으로 푸시
                for (int j = start + 1; j <= num; j++) {
                    
//                    i 가 1로 준다면 stack에 계속 1~반복될것임
//                    따라서 1부터 시작하지만,오름차순으로 중복은 없어야하므로
//                    start는 반복문이 종료할때마다 값을 초기화해주고
//                    start 값보다 작으면 들어갈 수 없게 조건을 설정해놨기 때문에 오름차순으로 push된다.
                    
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = num;
            } else if (stack.peek() != num) {   
                
                System.out.println("NO");
                System.exit(0); 
                // 0이되면 종료
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}