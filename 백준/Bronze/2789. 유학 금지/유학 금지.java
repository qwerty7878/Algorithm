import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll("C|A|M|B|R|I|D|G|E","");
		System.out.println(s);
	}
}