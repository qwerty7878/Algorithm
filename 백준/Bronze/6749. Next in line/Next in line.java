import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = 0;
        if(a < b){
            diff = b - a;
            int c = b + diff;
            System.out.println(c);
        }
        else{
            diff = a - b;
            int c = a + diff;
            System.out.println(c);
        }
    }
}