import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int cup  = 1;
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == cup)
                cup = y;
            else if(y == cup)
                cup = x;
        }
        System.out.println(cup);
    }
}