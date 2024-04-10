import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String>stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++){
			String s = br.readLine();
			String arr[] = s.split(" ");
			for(int j = 0; j < arr.length; j++){
				stack.push(arr[j]);
			}

			System.out.print("Case #" + (i + 1) + ": ");
			while(!stack.isEmpty()){
				System.out.print(stack.pop() + " ");
				if(stack.isEmpty())
					System.out.println();
			}
		}
	}
}