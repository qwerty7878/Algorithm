import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int [n];
		double sum = 0;

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);

		int cnt = 0;
		int max = -1;
		int mod = arr[0];
		boolean check = false;
		//	최빈값
		for(int i = 0; i < n - 1; i++){
			if(arr[i] == arr[i + 1])	
			//	정렬해서 i당시 배열값이랑 다음 값이랑 같으면 cnt 증가시킴
				cnt++;
			else
				cnt = 0;

			if(max < cnt){
				max = cnt;
				mod = arr[i];
				check = true;
			}
			else if(max == cnt && check == true){	
			//	if문이 처리된 이후 max = cnt와 check = true가 되었기 때문에 mod 초기화 라고 생각
				mod = arr[i];
				check = false;
			}
		}

		System.out.println(Math.round(sum/n));
		System.out.println(arr[(n-1)/2]);
		System.out.println(mod);
		System.out.println(arr[n-1] - arr[0]);
		
	}
}