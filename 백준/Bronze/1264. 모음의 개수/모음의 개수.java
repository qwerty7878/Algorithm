import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine().toLowerCase();
            if(str.equals("#"))
                break;
            int cnt = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
                str.charAt(i) == 'o' || str.charAt(i) == 'u')
                    cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}