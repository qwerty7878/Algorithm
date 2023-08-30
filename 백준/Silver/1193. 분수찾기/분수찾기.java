import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        int top = 1;
        int bot = 1;
        int cnt = 0;
        while(cnt < x){
            n++;
            cnt = n*(n+1)/2;
        }
        int num = x -(n-1)*n/2;
        if(n%2 == 0){
            top = num;
            bot = n - num + 1;
        }
        else{
            top = n - num + 1;
            bot = num;
        }
        if(x == 1)
            System.out.println("1/1");
        else
            System.out.println(top + "/" + bot);
    }
}