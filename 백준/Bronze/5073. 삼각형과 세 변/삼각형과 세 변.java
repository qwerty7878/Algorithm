import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a + b + c;

            if(a == 0 && b == 0 && c == 0)  break;

            if(Math.max(Math.max(a,b),c) < (sum - Math.max(Math.max(a,b),c))) {
                if (a == b && a == c && b == c) System.out.println("Equilateral");
                else if (a == b || a == c || b == c) System.out.println("Isosceles");
                else if (a != b && a != c && c != b) System.out.println("Scalene");
            }
            else System.out.println("Invalid");
        }
    }
}