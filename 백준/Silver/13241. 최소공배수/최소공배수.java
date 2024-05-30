import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {;

            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(a*b / gcd(a,b));
   }

   public static long gcd(long n, long m){
        if(m == 0)  return n;
        return gcd(m, n%m);
   }
}
