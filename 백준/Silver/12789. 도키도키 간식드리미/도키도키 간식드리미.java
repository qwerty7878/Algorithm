import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < n; i++){
			queue.add(Integer.parseInt(st.nextToken()));
		}

		int num = 1;

		while(!queue.isEmpty()){
			if(queue.peek() == num){
				queue.poll();
				num++;
			}
			else if(!stack.isEmpty() && stack.peek() == num){
				stack.pop();
				num++;
			}
			else
				stack.push(queue.poll());
		}
		while(!stack.isEmpty()){
			if(stack.peek() == num){
				stack.pop();
				num++;
			}
			else{
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
	}
}