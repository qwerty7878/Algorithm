import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a >= b)
                System.out.println("MMM BRAINS");
            else
                System.out.println("NO BRAINS");

        }
    }
}