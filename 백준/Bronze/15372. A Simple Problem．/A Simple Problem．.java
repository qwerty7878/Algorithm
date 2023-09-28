import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            long n = sc.nextLong();
            long k = (long)Math.pow(n,2);
            System.out.println(k);
        }
    }
}