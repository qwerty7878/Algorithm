import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m =  sc.nextInt();
        int c =  sc.nextInt();

        int min_sum = m + c;
        m = min_sum % 60;
        h =  (h + (min_sum / 60)) % 24;

        System.out.printf("%d %d",h,m);
    }
}