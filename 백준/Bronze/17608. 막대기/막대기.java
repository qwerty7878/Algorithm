import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int [n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		int cnt = 1; // 오른쪽에선 최소 1개
		int maxHeight = arr[arr.length - 1];

		for(int i = arr.length - 2; i >= 0; i--){
			if(arr[i] > maxHeight){
				cnt++;
				maxHeight = arr[i];
			}
		}
		System.out.println(cnt);
	}
}