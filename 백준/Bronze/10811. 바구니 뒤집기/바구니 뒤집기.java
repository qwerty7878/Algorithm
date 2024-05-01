import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n + 1];

        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        for(int a = 1; a <= m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int b = i; b < j; b++){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
