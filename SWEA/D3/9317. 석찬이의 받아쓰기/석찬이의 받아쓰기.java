import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            int strlen = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            int cnt = 0;
            for(int i = 0; i < strlen; i++){
                if(a.charAt(i) == b.charAt(i)){
                    cnt++;
                }
            }
            System.out.printf("#%d %d\n",tc + 1,cnt);
        }
    }
}