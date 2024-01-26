import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;

		int room[][] = new int [2][7]; // 학생 수
		for(int i = 0; i < n; i++){
			int s = sc.nextInt();
			int y = sc.nextInt();
			room[s][y]++;
		}

		for(int i = 0; i < 2; i++){ // 0,1
			for(int j = 1; j <= 6; j++){ // 1~6
				cnt += room[i][j]/k;
				if(room[i][j] % k != 0)
					cnt++;
			}
		}
		System.out.println(cnt);
    }
}
