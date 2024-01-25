import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String s = "";
		for(int i = 1; i <= 5; i++){
			if(sc.next().contains("FBI"))
				s += i + " ";
		}
		if(s.isEmpty())
			System.out.println("HE GOT AWAY!");
		else
			System.out.println(s);
	}
}