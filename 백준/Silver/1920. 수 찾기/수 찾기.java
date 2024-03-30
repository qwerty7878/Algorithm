import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int m = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++){
			if(BinarySearch(arr, sc.nextInt()) >= 0)
				sb.append(1).append('\n');
			else
				sb.append(0).append('\n');
		}

		System.out.println(sb);
	}

	public static int BinarySearch(int arr[], int key){

		int left_index = 0;
		int right_index = arr.length - 1;

		while(left_index <= right_index){

			int mid = (left_index + right_index)/2;

			if(key < arr[mid])
				right_index = mid - 1;
			else if(key > arr[mid])
				left_index = mid + 1;
			else
				return mid;
		}
			return -1;
	}
}
