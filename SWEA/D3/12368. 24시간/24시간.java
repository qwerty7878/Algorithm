import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int tc = 0; tc < t; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = a + b;
            if(a + b == 24){
                ans = 0;
            }
            if(a + b > 24){
                ans = (a + b) % 24;
            }

            System.out.printf("#%d %d\n",tc + 1,ans);
        }
    }
}