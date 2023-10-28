import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            String Reverse = sb.reverse().toString();
            //reverse를 쓰기 위해서 stringbuilder를 사용
            if(s.equals("0"))
                break;
            if(s.equals(Reverse))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}