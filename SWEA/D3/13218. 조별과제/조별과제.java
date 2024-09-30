import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int tc = 0; tc < t; tc++){
            int n = sc.nextInt();

            int ans = n / 3;

            System.out.printf("#%d %d\n",tc + 1,ans);
        }
    }
}