import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= 12 && a <= 16)
            if(b == 0)
                System.out.println("320");
            else
                System.out.println("280");
        else
            System.out.println("280");
    }
}