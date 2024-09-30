import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int tc = 0; tc < 10; tc++){
            int t = sc.nextInt();

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("#%d %d\n",t,ans(a,b));
        }
    }

    static long ans(int a,int b){
        if(b == 1){
            return a;
        }
        if(b == 0){
            return 1;
        }
        return a * ans(a, b - 1);
    }
}