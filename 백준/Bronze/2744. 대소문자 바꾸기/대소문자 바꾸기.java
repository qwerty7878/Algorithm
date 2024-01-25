import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();

		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);

			if(Character.isUpperCase(c))
				System.out.print(String.valueOf(c).toLowerCase());
			else
				System.out.print(String.valueOf(c).toUpperCase());
		}
	}
}