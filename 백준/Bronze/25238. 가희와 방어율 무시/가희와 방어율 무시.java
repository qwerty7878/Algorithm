import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int dr = a * (100-b)/100;
        if(dr >= 100)
            System.out.println("0");
        else
            System.out.println("1");
    }
}