import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // a/b
		int b = sc.nextInt();

		int c = sc.nextInt(); // c/d
		int d = sc.nextInt();

		int ans1 = (a*d) + (b*c);
		int ans2 = b * d;

		System.out.println(ans1/gcd(ans1,ans2) + " " + ans2/gcd(ans1,ans2));
	}
	public static int gcd(int n,int m){ // 유클리드 호제법
		if(m == 0) return n;

		return gcd(m, n%m);
	}
}