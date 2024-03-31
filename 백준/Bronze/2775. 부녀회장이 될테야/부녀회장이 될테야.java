import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int [15][15];

		for(int i = 0; i < 15; i++){
			arr[0][i] = i;
			arr[i][1] = 1;
		}

		for(int i = 1; i < 15; i++){
			for(int j = 2; j < 15; j++){
				arr[i][j] = arr[i - 1][j] + arr[i][j-1];
			}
		}

		int t = sc.nextInt();

		for(int i = 0; i < t; i++){
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(arr[k][n]);
		}
	}
}