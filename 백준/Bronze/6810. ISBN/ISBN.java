import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 9 + 7 * 3 + 8 + 0 * 3 + 9 + 2 * 3 + 1 + 4 * 3 + 1 + 8 * 3;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum += a + b * 3 + c;
        System.out.println("The 1-3-sum is " + sum);      
    }
}