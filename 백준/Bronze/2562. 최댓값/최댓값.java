import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int arr[] = new int [9];
			int max	= 0;
			int cnt = 0;

			for(int i = 0; i < arr.length; i++){
				arr[i] = sc.nextInt();

				if(max < arr[i]){
					max = arr[i];
					cnt = i + 1; // 배열은 0부터니까
				}
			}
			System.out.println(max);
			System.out.println(cnt);
			
		}
	}