import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while(n != 1){
            if(n%2 == 0)
                n = n/2;
            else
                n = n+1;
            cnt++;
        }
        System.out.println(cnt);
    }
}