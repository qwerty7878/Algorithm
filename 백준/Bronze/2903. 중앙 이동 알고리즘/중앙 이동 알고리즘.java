import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long dot = 1 + (long)Math.pow(2,n); // 2가 들어간 이유는 4 9 25... 로 제곱이므로
                                            // = 2의 (n+1)승이란 뜻임
        System.out.println(dot * dot);
    }
}