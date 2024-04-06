import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		int card[] = new int [n];

		for(int i = 0; i < n; i++){
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		
		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
			int num = sc.nextInt();
			if(Arrays.binarySearch(card, num) < 0) sb.append("0 ");
			else sb.append("1 ");
		}
		System.out.println(sb);
	}
}