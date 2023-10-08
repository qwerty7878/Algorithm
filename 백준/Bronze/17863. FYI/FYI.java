import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.indexOf("555") == 0)
        //indexOf 사용 후 0,1을 사용해서 유무 파악가능
            System.out.println("YES");
        else
            System.out.println("NO");
        }
    }