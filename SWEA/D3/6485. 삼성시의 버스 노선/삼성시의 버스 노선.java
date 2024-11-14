import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            int bus[] = new int[5001];
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int j = a; j <= b; j++) {
                    bus[j]++;
                }
            }

            int p = sc.nextInt();
            int arr[] = new int[p];
            for (int i = 0; i < p; i++) {
                arr[i] = bus[sc.nextInt()];
            }

            System.out.printf("#%d ",tc);
            for (int i = 0; i < p; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
