import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int [n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int waiting_time = 0;
		int sum = 0;

		for(int i = 0; i < n; i++){
			sum += waiting_time + arr[i];
			waiting_time += arr[i];
		}

		System.out.println(sum);
	}
}