import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<int []> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 1; i <= n; i++){
			int top = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty()){
				if(stack.peek()[1] > top){ // 스택에 peek한 값이 top보다 크면 밑에 stack.push(new int[]{i,top})으로 탑 번호 출력
					sb.append(stack.peek()[0] + " ");
					break;
				}
				stack.pop(); // 낮으면 제거를 없어질때까지 반복
			}
			if(stack.isEmpty()) // 스택이 비어있다면 0을 출력
				sb.append("0 ");

			stack.push(new int[]{i,top});
		}
		System.out.print(sb);
	}
}