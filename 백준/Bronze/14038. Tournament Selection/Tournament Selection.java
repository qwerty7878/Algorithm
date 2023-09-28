import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        for(int i = 0; i < 6; i++){
            String s = sc.next();
            if(s.equals("W"))
                win ++;
        }
        if(win == 6 || win == 5)
            System.out.println(1);
        else if(win == 4 || win == 3)
            System.out.println(2);
        else if(win == 2 || win == 1)
            System.out.println(3);
        else
            System.out.println(-1);
    }
}