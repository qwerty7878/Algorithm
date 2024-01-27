import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [9];
		int spy1 = 0, spy2 = 0;
		int sum = 0;

		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);
		for(int i = 0; i < 8; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] + arr[j] == sum - 100){
					spy1 = i;
					spy2 = j;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			if(i == spy1 || i == spy2)
				continue;
			System.out.println(arr[i]);
		}
	}
}