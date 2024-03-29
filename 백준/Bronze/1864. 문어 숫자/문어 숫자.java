import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.nextLine();
            int n = 0;

            if(s.equals("#"))
                break;
            
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '-')
                    n += 0 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '\\')
                    n += 1 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '(')
                    n += 2 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '@')
                    n += 3 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '?')
                    n += 4 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '>')
                    n += 5 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '&')
                    n += 6 * Math.pow(8, s.length() - 1 - i);
                else if(s.charAt(i) == '%')
                    n += 7 * Math.pow(8, s.length() - 1 - i);
                else
                    n += -1 * Math.pow(8, s.length() - 1 - i);
            }
        System.out.println(n);
        }       

	}
}