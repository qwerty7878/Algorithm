import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();
            
            int comA = p * w;
            int comB = 0;
            if(w <= r){
                comB = q;
            }else{
                comB = q + (w - r) * s;
            }

            System.out.println("#" + (i + 1) + " " + Math.min(comA, comB));
        }
    }
}
