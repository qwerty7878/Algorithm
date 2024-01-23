import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bird = 1;
        int sec = 0;

        while(n >= 1){
            if(n < bird){
                bird = 1;
            }
            n -= bird;
            bird++;
            sec++;
        }
        System.out.println(sec);
    }
}