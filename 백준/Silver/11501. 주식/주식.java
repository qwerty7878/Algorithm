import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            long sum = 0;
            long max = arr[n - 1];

            for (int j = n - 2; j >= 0; j--) {
                if (max > arr[j]) {
                    sum += max - arr[j];
                } else {
                    max = Math.max(max, arr[j]);
                }
            }

            System.out.println(sum);
        }
    }
}