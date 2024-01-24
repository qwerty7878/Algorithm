import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		//최대값 저장할 변수 선언
		int max = 0;

		for(int i = 0; i < N; i++) {

			int money = 0;
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if(A == B && B == C ) {
				money = 10000 + (A * 1000);
			}else if(A != B && B != C && A != C) {
				money = Math.max(A, Math.max(B, C)) * 100;
			}else {
				if(A == B || A == C) {
					money = 1000 + (A * 100);
				}else {
					money = 1000 + (B * 100);
				}
			}
			if(money > max) {
				max = money;
			}
		}
		System.out.println(max);
	}

}