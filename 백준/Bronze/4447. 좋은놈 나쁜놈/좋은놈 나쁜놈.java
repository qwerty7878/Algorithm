import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            int g = 0;
            int b = 0;
            String s1 = s.replace(" ","").toLowerCase();
            for(int j = 0; j < s1.length(); j++){
                if(s1.charAt(j) == 'g')
                    ++g;
                else if(s1.charAt(j) == 'b')
                    ++b;
            }
            if(g > b)
                System.out.println(s + " is GOOD");
            else if(g < b)
                System.out.println(s + " is A BADDY");
            else
            	System.out.println(s + " is NEUTRAL");
        }
	}
}