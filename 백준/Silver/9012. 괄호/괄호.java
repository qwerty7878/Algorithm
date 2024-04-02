import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int t = Integer.parseInt(br.readLine());

		for(int i = 0; i < t; i++){
			String s = br.readLine();
			Stack<Character> stack = new Stack<Character>();

			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j) == '(')
					stack.push(s.charAt(j));
				else{
					if(stack.isEmpty()){
						stack.push(s.charAt(j));
						break;
					}
					else
						stack.pop();
				}
			}
			if(stack.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}