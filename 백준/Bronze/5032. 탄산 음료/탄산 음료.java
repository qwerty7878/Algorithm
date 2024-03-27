import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        
        int empty_bottle = e + f;
        int ans = 0; // 총 마실 수 있는 탄산

        while(empty_bottle >= c){
            int soda = empty_bottle / c; // 마실 수 있는 탄산
            ans += soda;
            empty_bottle = soda + (empty_bottle % c);
        }
        System.out.println(ans);
    }
}