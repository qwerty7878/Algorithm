import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String str = String.valueOf(a*b*c);
        // String str = Integer.toString(res); 
        // String str = "" + res;
        //charAt()을 쓰려면 string 형태여야해서

        for(int i = 0; i <= 9; i++){ // 1~9까지 출력하려고
            int cnt = 0;
            for(int j = 0; j < str.length(); j++){
                if((str.charAt(j) - '0') == i)
                    cnt++;

            }
            System.out.println(cnt);
        }
        
    }
}