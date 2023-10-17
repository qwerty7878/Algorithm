import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long r1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        long r2 = sc.nextLong();
        
        if((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) < (r1 + r2) * (r1 + r2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}