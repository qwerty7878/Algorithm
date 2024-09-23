import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s).reverse();

            if(s.equals(sb.toString())){
                System.out.println("#" + (i + 1) + " " + 1);
            }else{
                System.out.println("#" + (i + 1) + " " + 0);
            }
        }
    }
}
