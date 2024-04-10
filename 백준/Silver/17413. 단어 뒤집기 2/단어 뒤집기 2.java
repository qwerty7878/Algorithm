import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character>stack = new Stack<>();

		String s = br.readLine();
		boolean check = false;

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '<'){
				while(!stack.isEmpty()){
					sb.append(stack.pop());
				}
				check = true;
			}
			else if(s.charAt(i) == '>'){
				check = false;
				sb.append(s.charAt(i));
				continue;
			}
			if(check == true){
				sb.append(s.charAt(i));
			}
			else if(check == false){
				if(s.charAt(i) == ' '){
					while(!stack.isEmpty()){
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				}
				else
					stack.push(s.charAt(i));
			}
			if(i == s.length() - 1){
				while(!stack.isEmpty())
					sb.append(stack.pop());
			}
		}
		System.out.println(sb);
	}
}