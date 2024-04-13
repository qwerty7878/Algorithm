import java.util.*;
 
public class Main {

	public static boolean primeNum[];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int m = sc.nextInt();
		int n = sc.nextInt();

		primeNum = new boolean [n + 1]; // 0~n까지
		isPrime();

		for(int i = m; i <=n; i++){
			// false 값이 소수
			if(primeNum[i] == false)
				sb.append(i).append('\n');

		}
		System.out.println(sb.toString());
	}

	public static void isPrime() {

		// 에라토스테네스의 체를  이용한 알고리즘

		primeNum[0] = primeNum[1] = true; //소수는 0,1은 아니니까
		// k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외
		for(int i = 2; i < Math.sqrt(primeNum.length); i++){
			if(primeNum[i])	continue;
			// i의 배수인지 확인하는 방법
			for(int j = i * i; j < primeNum.length; j += i){
				primeNum[j] = true;
			}
		}
	}
}