import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a == 0 && b == 0 && c ==0)
                break;
            int max = Math.max(Math.max(a,b),c);
            
            if(max == a){
                int sum = b + c;
                if(a >= sum){
                    System.out.println("Invalid");
                    continue;
                }
            }
            if(max == b){
                int sum = a + c;
                if(b >= sum){
                    System.out.println("Invalid");
                    continue;
                }
            }if(max == c){
                int sum = b + a;
                if(c >= sum){
                    System.out.println("Invalid");
                    continue;
                }
            }
            if(a != b && a != c && b != c){
                System.out.println("Scalene");
                continue;
            }
            if(a == b && a == c && b == c){
                System.out.println("Equilateral");
                continue;
            }
            if(a == b || a == c || b == c){
                System.out.println("Isosceles");
                continue;
            } 
        }
    }
}