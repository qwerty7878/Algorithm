import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int a = 0, b = 0, c = 0, d = 0, e = 0;
            while (true) {
                if (num % 2 == 0) {
                    a += 1;
                    num /= 2;
                } else if (num % 3 == 0) {
                    b += 1;
                    num /= 3;
                } else if (num % 5 == 0) {
                    c += 1;
                    num /= 5;
                } else if (num % 7 == 0) {
                    d += 1;
                    num /= 7;
                } else if (num % 11 == 0) {
                    e += 1;
                    num /= 11;
                } else if(num % 2 != 0 && num % 3 != 0 && num % 5 !=0 && num % 7 !=0&& num % 11 !=0) {
                    break;
                }
            }
            System.out.println("#" + (i+1) + " " + a + " "+ b + " " + c + " " + d + " " + e);
        }
    }
}