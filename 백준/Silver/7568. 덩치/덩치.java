import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		int arr[][] = new int [n][2];

		for(int i = 0; i < n; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			int cnt = 1;
			for(int j = 0; j < n; j++){
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					cnt++;
			}
			sb.append(cnt).append(' ');
		}
		System.out.println(sb);
	}
}
