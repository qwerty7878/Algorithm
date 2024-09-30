import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int tc = 0; tc < t; tc++){
            int l = sc.nextInt();
            int u = sc.nextInt();
            int x = sc.nextInt();

            int ans = 0;
            
            if(x < l){
                ans = l - x;
            }
            if(x > u){
                ans = -1;
            }
            if(x >= l && x <= u){
                ans = 0;
            }

            System.out.printf("#%d %d\n",tc + 1,ans);
        }
    }
}