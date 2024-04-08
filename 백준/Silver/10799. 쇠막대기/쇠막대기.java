import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character>stack = new Stack<>();
		String s = sc.next();

		int cnt = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push('(');
				continue;
			}
			if(s.charAt(i) == ')'){
				stack.pop();

				if(s.charAt(i - 1) == '(')
					cnt += stack.size();
				else
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}