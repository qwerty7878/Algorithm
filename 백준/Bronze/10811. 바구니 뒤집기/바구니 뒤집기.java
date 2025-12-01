import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            swapArray(arr, i, j);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void swapArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
            i++;
            j--;
        }
    }
}