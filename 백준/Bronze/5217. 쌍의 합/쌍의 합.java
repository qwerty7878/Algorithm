import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int cnt = 0;
       for(int i = 0; i < n; i++){
            int T = sc.nextInt();
            String s = "Pairs for " + T + ": ";
            System.out.print(s);
            for(int a = 1; a < T; a++){
                for(int b = a + 1; b < T; b++){
                    if(a<b && a!=b && a+b == T && cnt == 0){
                        System.out.print(a + " " + b);
                        cnt = 1;
                    }
                    else if(a<b && a!=b && a+b == T && cnt == 1){
                        System.out.print(", " + a + " " + b);
                        cnt = 1;
                    }
                }
       }
       cnt = 0;
       System.out.println();
    }
}
}