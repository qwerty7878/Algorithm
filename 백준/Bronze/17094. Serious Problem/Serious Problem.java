import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int cnte = 0;
        int cnt2 = 0;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '2')
                cnt2++;
            else if(c == 'e')
                cnte++;
        }

        if(cnt2 > cnte)
            System.out.println("2");
        else if(cnt2 < cnte)
            System.out.println("e");
        else
            System.out.println("yee");

    }
}