import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // business class rows
        int k1 = sc.nextInt(); // business seats
        int n2 = sc.nextInt(); // economic class rows
        int k2 = sc.nextInt(); // economic seats
        
        int sum = n1 * k1 + n2 * k2;
        System.out.println(sum);
    }
}