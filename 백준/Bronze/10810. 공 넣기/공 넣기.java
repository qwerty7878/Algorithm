import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[] = new int [n + 1];

        for(int a = 1; a <= m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int b = i; b <= j; b++){
                arr[b] = k;
            }
        }

        for(int a = 1; a <= n; a++){
            System.out.print(arr[a] + " ");
        }

        sc.close();
    }
}