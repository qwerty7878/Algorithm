import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int yt = 0;
        int mt = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(t % 30 >= 0)
                yt += ((t/30) + 1) * 10;
            else
                yt += (t/30) * 10;
            if(t % 60 >= 0)
                mt += ((t/60) + 1) * 15;
            else if(t < 60)
                mt += (t/60) * 15;
        }
        if(yt > mt)
            System.out.println("M "+ mt);
        else if(yt == mt)
            System.out.println("Y M " + yt);
        else
            System.out.println("Y " + yt);
    }
}