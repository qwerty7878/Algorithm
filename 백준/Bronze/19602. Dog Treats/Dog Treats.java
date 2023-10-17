import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int res = s*1 + m*2 + l*3;
        if(res >= 10)
            System.out.println("happy");
        else
            System.out.println("sad");
    }
}