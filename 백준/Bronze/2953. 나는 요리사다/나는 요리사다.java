import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int arr[][] = new int [5][4];
		int sum = 0;
		int max = 0; // 최대 점수
		int num = 0; // 몇번쨰?
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 4; j++){
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			if(max < sum){
				max = sum;
				num = i + 1; // 배열은 0 부터니까
			}
			sum = 0; // 매 번 초기화 시켜놔야 비교할 수 있음
		}
		System.out.println(num + " " + max);
    }
}
