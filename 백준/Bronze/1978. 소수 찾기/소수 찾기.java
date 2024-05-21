import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int m = sc.nextInt();

            for(int j = 2; j <= m; j++){
                if(m == j) cnt++;
                if(m % j == 0) break;
            }
        }
        System.out.println(cnt);
    }
}