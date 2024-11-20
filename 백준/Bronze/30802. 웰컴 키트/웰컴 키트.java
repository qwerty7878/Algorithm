import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i] / t;
            if (arr[i] % t != 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        System.out.printf("%d %d",(n / p),(n % p));
    }
}
