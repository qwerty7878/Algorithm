import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int a = 1; a <= t; a++) {
            int n = sc.nextInt();
            int max = -1;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int res = arr[i] * arr[j];
                    String s = "" + res;
                    boolean flag = true;
                    for (int k = 1; k < s.length(); k++) {
                        if (s.charAt(k - 1) > s.charAt(k)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        max = Math.max(max, res);
                    }
                }
            }
            System.out.printf("#%d %d\n",a,max);
        }
    }
}
