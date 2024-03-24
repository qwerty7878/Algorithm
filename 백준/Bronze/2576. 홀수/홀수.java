import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd_sum = 0;
        int min = 10000;

        for(int i = 0; i < 7; i++){
            int n = sc.nextInt();
            if(n % 2 == 1){
                odd_sum += n;
                min = Math.min(min, n);
            }
        }

        if(odd_sum == 0)
            System.out.println(-1);
        else{
            System.out.println(odd_sum);
            System.out.println(min);
        }
        sc.close();
    }
}