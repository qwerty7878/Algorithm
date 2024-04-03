import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String s = sc.nextLine();
			if(s.equals(".")) break;
			System.out.println(ans(s));
		}
	}

	public static String ans(String s){
		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '[')
				stack.push(s.charAt(i));
			else if(s.charAt(i) == ')'){
				if(stack.isEmpty() || stack.peek() != '(')
					return "no";
				else
					stack.pop();
			}
			else if(s.charAt(i) == ']'){
				if(stack.isEmpty() || stack.peek() != '[')
					return "no";
				else
					stack.pop();
			}
			
		}
		if(stack.isEmpty())
			return "yes";
		else
			return "no";
	}
}