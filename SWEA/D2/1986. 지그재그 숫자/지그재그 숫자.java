import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int res = 1;
            for (int j = 2; j <= num; j++) {
                if (j % 2 == 0) {
                    res -= j;
                }  //  -
                else {  //  +
                    res += j;
                }
            }
            System.out.println("#" + (i+1) + " " + res);
        }
    }
}