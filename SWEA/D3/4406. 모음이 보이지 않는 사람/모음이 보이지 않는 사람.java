import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            String s = sc.next();
            String ans = s.replaceAll("[a,e,i.o,u]", "");
            System.out.println("#" + (tc + 1) + " " + ans);
        }
    }
}