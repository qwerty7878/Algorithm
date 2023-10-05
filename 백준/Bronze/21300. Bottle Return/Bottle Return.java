import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        for(int i = 0; i < 6; i++){
            result += sc.nextInt();
        }
        System.out.println(result*5);
    }
}