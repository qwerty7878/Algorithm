import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {;

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b / gcd(a,b));
        }
   }

   public static int gcd(int n, int m){
        if(m == 0)  return n;
        return gcd(m, n%m);
   }
}
