import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int pn = sc.nextInt();
            for(int j = 2; j <= pn; j++){
                if(j == pn)
                    cnt++;
                if(pn%j == 0)
                    break;
            }
        }
        System.out.println(cnt);
    }
}