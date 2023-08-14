import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();
        System.out.println(S.charAt(i-1)); // 배열이라 0부터임이므로 -1을 해줘야함
    }
}