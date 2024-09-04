import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int omwon = 0;
            int mwon = 0;
            int ocwon = 0;
            int cwon = 0;
            int obwon = 0;
            int bwon = 0;
            int oswon = 0;
            int swon = 0;

            while (n != 0) {
                omwon = n / 50000;
                n = n % 50000;
                mwon = n / 10000;
                n = n % 10000;
                ocwon = n / 5000;
                n = n % 5000;
                cwon = n / 1000;
                n = n % 1000;
                obwon = n / 500;
                n = n % 500;
                bwon = n / 100;
                n = n % 100;
                oswon = n / 50;
                n = n % 50;
                swon = n / 10;
                n = n % 10;
                break;
            }
            System.out.println("#" + (i + 1));
            System.out.println(omwon + " " + mwon + " " + ocwon + " " + cwon + " " + obwon + " " + bwon + " " + oswon + " " + swon);
        }
    }
}