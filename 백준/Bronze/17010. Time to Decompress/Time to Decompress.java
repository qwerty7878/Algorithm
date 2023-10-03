import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            String s = sc.next();
            for(int j = 0; j < m; j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}    