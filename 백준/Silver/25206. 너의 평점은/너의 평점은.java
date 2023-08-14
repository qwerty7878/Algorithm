import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double aa = 0;
        double point = 0;
        for(int i = 0; i < 20; i++){
            String title = sc.next();
            double a = sc.nextDouble();
            String b = sc.next();
            
            if(b.equals("A+")){
                aa += 4.5 * a;
                point += a;
            }
            else if(b.equals("A0")){
                aa += 4.0 * a;
                point += a;
            }
            else if(b.equals("B+")){
                aa += 3.5 * a;
                point += a;
            }
            else if(b.equals("B0")){
                aa += 3.0 * a;
                point += a;
            }
            else if(b.equals("C+")){
                aa += 2.5 * a;
                point += a;
            }
            else if(b.equals("C0")){
                aa += 2.0 * a;
                point += a;
            }
            else if(b.equals("D+")){
                aa += 1.5 * a;
                point += a;
            }
            else if(b.equals("D0")){
                aa += 1.0 * a;
                point += a;
            }
            else if(b.equals("F")){
                aa += 0.0 * a;
                point += a;
            }
        }
        System.out.printf("%.6f",aa/point);
    }
}