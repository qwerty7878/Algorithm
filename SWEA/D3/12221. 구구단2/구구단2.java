import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = -1;
            if(a < 10 && b < 10){
                ans = a * b;
            }
            System.out.printf("#%d %d\n",tc + 1, ans);
        }
    }
}