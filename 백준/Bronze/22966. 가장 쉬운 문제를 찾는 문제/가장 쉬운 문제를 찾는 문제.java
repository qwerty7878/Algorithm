import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 5;
        String answer = "";
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int a = sc.nextInt();
            if(a < min){
                min = a;
                answer = s;
            }
        }
        System.out.println(answer);
    }
}