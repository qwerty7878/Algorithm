import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int max = 0;

		for(int i = 0; i < n; i++) {

			int price = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == b && b == c ) {
				price = 10000 + (a * 1000);
			}else if(a != b && b != c && a != c) {
				price = Math.max(a, Math.max(b, c)) * 100;
			}else {
				if(a == b || a == c) {
					price = 1000 + (a * 100);
				}else {
					price = 1000 + (b * 100);
				}
			}
			if(price > max) {
				max = price;
			}
		}
		System.out.println(max);
	}

}