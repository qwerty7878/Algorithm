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
			sb.append(end(card,num) - start(card,num)).append(' ');
		}
		System.out.println(sb);
	}
		public static int start(int arr[], int key) {

			int left = 0;
			int right = arr.length;
			
			while(left < right){
				int mid = (left + right)/2;
				if(key <= arr[mid])
					right = mid;
				else
					left = mid + 1;
			}
			return left;
		}

		public static int end(int arr[], int key) {
			
			int left = 0;
			int right = arr.length;
			
			while(left < right){
				int mid = (left + right)/2;
				if(key < arr[mid])
					right = mid;
				else
					left = mid + 1;
			}
			return left;
		}
}