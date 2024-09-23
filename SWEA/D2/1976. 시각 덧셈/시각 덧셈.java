import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();

            int asum = a1 + a2;
            int bsum = b1 + b2;
            if(bsum >= 60){
                asum += (bsum/60);
                bsum %= 60;
            }
            if(asum >= 13){
                asum %= 12;
            }
            if((asum %= 12) == 0){
                asum = 12;
            }

            System.out.println("#" + (i + 1) + " " + asum + " " + bsum);
        }
    }
}
