import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            if (arr[i] == 1) {
                continue;
            } else if (arr[i] == 2) {
                primeCount += 1;
                continue;
            } else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                    } else if (isPrime && (j + 1) == arr[i]) {
                        primeCount += 1;
                    }
                }
            }
        }
        System.out.println(primeCount);
    }
}