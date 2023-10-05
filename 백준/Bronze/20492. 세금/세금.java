import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = (long)(n * 0.78);
        long b = (long)((n * 0.8) + (n * 0.2 * 0.78));
        System.out.println(a + " " + b);
    }
}