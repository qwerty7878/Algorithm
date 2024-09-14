import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[101];
            for (int j = 0; j < 1000; j++) {
                int num = sc.nextInt();
                arr[num]++;
            }

            int max = 0;
            int idx = 0;
            for (int j = 0; j < arr.length; j++) {
                if (max <= arr[j]) {
                    max = arr[j];
                    idx = j;
                }
            }

            System.out.println("#" + (i + 1) + " " + idx);
        }

    }
}