import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // / 라는 기호가 숫자랑 같이 들어가므로 String 배열을 사용.
        String arr[] = s.split("/");
        //배열을 쪼개는 단위를 / 로 하겠다.

        int k = Integer.valueOf(arr[0]);
        int d = Integer.valueOf(arr[1]);
        int a = Integer.valueOf(arr[2]);
        // Scanner에선 Integer.valueOf를 사용해서 정수화 시킴
        // BufferedReader 에선 Integer.parseInt를 사용함
        
        if(k + a < d || d == 0)
            System.out.println("hasu");
        else
            System.out.println("gosu");
    }
}